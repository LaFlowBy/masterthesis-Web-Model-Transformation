package org.eclipse.glsp.example.javaemf.model;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.glsp.example.javaemf.FMCheckModelTypes;
import org.eclipse.glsp.example.typegraph.typegraph.TypeEdge;
import org.eclipse.glsp.example.typegraph.typegraph.TypeGraph;
import org.eclipse.glsp.example.typegraph.typegraph.TypeNode;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.graph.GGraph;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.builder.impl.GEdgeBuilder;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.builder.impl.GLayoutOptions;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.graph.util.GConstants;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.notation.EMFNotationGModelFactory;

public class TypeGraphGModelFactory extends EMFNotationGModelFactory {

    @Override
    protected void fillRootElement(final EObject semanticModel, final Diagram notationModel, final GModelRoot newRoot) {
        TypeGraph typeGraph = TypeGraph.class.cast(semanticModel);
        GGraph graph = GGraph.class.cast(newRoot);
        if (notationModel.getSemanticElement() != null
            && notationModel.getSemanticElement().getResolvedSemanticElement() != null) {
            typeGraph.getTypenodes().stream()
                .map(this::createTypeNode)
                .forEachOrdered(graph.getChildren()::add);
            typeGraph.getTypeedges().stream()
                .map(this::createTypeEdge)
                .forEachOrdered(graph.getChildren()::add);
        }
    }

    protected GNode createTypeNode(final TypeNode typeNode) {
        GNodeBuilder taskNodeBuilder = new GNodeBuilder(FMCheckModelTypes.TASK)
            .id(idGenerator.getOrCreateId(typeNode))
            .addCssClass("tasklist-node")
            .add(new GLabelBuilder(DefaultTypes.LABEL).text(typeNode.getName()).id(typeNode.getId() + "_label").build())
            .layout(GConstants.Layout.HBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5));

        applyShapeData(typeNode, taskNodeBuilder);
        return taskNodeBuilder.build();
    }

    protected GEdge createTypeEdge(final TypeEdge typeEdge) {
        GEdgeBuilder edgeBuilder = new GEdgeBuilder(FMCheckModelTypes.TASK)
            .id(idGenerator.getOrCreateId(typeEdge))
            .sourceId(idGenerator.getOrCreateId(typeEdge.getSource()))
            .targetId(idGenerator.getOrCreateId(typeEdge.getTarget()))
            .addCssClass("tasklist-edge");

        applyEdgeData(typeEdge, edgeBuilder);
        return edgeBuilder.build();
    }
}
