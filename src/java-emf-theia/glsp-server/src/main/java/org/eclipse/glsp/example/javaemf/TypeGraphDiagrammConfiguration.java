package org.eclipse.glsp.example.javaemf;

import java.util.List;

import org.eclipse.glsp.server.diagram.BaseDiagramConfiguration;
import org.eclipse.glsp.server.types.EdgeTypeHint;
import org.eclipse.glsp.server.types.ShapeTypeHint;

public class TypeGraphDiagrammConfiguration extends BaseDiagramConfiguration {
    @Override
    public List<ShapeTypeHint> getShapeTypeHints() {
        // tasks can be moved, deleted and resized
        return List.of(new ShapeTypeHint(TypeGraphModelTypes.TYPE_NODE, true, true, true, false));
    }

    @Override
    public List<EdgeTypeHint> getEdgeTypeHints() { return List.of(); }
}
