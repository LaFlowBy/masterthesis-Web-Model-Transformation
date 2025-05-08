/**
 * Copyright (c) 2022 EclipseSource and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 */
package org.eclipse.glsp.example.typegraph.typegraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.example.typegraph.typegraph.TypeGraph#getTypenodes <em>Typenodes</em>}</li>
 *   <li>{@link org.eclipse.glsp.example.typegraph.typegraph.TypeGraph#getTypeedges <em>Typeedges</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.example.typegraph.typegraph.ModelPackage#getTypeGraph()
 * @model
 * @generated
 */
public interface TypeGraph extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Typenodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.example.typegraph.typegraph.TypeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typenodes</em>' containment reference list.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.ModelPackage#getTypeGraph_Typenodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeNode> getTypenodes();

	/**
	 * Returns the value of the '<em><b>Typeedges</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeedges</em>' containment reference list.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.ModelPackage#getTypeGraph_Typeedges()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeEdge> getTypeedges();

} // TypeGraph
