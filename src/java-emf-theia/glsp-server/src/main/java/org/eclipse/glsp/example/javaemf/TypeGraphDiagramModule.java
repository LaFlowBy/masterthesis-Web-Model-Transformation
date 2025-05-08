package org.eclipse.glsp.example.javaemf;

import org.eclipse.glsp.example.javaemf.handler.CreateTypeNodeHandler;
import org.eclipse.glsp.example.javaemf.model.TypeGraphGModelFactory;
import org.eclipse.glsp.example.javaemf.model.TypeGraphSourceModelStorage;
import org.eclipse.glsp.example.javaemf.palette.TypeGraphToolPaletteItemProvider;
import org.eclipse.glsp.server.di.MultiBinding;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.EMFSourceModelStorage;
import org.eclipse.glsp.server.emf.idgen.AttributeIdGenerator;
import org.eclipse.glsp.server.emf.notation.EMFNotationDiagramModule;
import org.eclipse.glsp.server.features.core.model.GModelFactory;
import org.eclipse.glsp.server.features.toolpalette.ToolPaletteItemProvider;
import org.eclipse.glsp.server.operations.OperationHandler;

public class TypeGraphDiagramModule extends EMFNotationDiagramModule {
    @Override
    protected Class<? extends DiagramConfiguration> bindDiagramConfiguration() {
        // define what operations are allowed with our elements
        return TypeGraphDiagrammConfiguration.class;
    }

    @Override
    protected Class<? extends EMFSourceModelStorage> bindSourceModelStorage() {
        // ensure our custom package is registered when loading our models
        return TypeGraphSourceModelStorage.class;
    }

    @Override
    public Class<? extends GModelFactory> bindGModelFactory() {
        // custom factory to convert tasks into nodes
        return TypeGraphGModelFactory.class;
    }

    @Override
    protected Class<? extends EMFIdGenerator> bindEMFIdGenerator() {
        // all our elements inherit from Identifiable and have an ID attribute set
        return AttributeIdGenerator.class;
    }

    @Override
    protected Class<? extends ToolPaletteItemProvider> bindToolPaletteItemProvider() {
        return TypeGraphToolPaletteItemProvider.class;
    }

    @Override
    protected void configureOperationHandlers(final MultiBinding<OperationHandler<?>> binding) {
        super.configureOperationHandlers(binding);
        binding.add(CreateTypeNodeHandler.class);
        // binding.add(DeleteTaskNodeHandler.class);
    }

    @Override
    public String getDiagramType() { return "typegraph-diagram"; }

}
