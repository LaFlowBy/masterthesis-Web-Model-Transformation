package org.eclipse.glsp.example.javaemf.model;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.glsp.example.typegraph.typegraph.ModelPackage;
import org.eclipse.glsp.server.emf.notation.EMFNotationSourceModelStorage;

public class TypeGraphSourceModelStorage extends EMFNotationSourceModelStorage {
    @Override
    protected ResourceSet setupResourceSet(final ResourceSet resourceSet) {
        resourceSet.getPackageRegistry().put(ModelPackage.eINSTANCE.getNsURI(), ModelPackage.eINSTANCE);
        return super.setupResourceSet(resourceSet);
    }
}
