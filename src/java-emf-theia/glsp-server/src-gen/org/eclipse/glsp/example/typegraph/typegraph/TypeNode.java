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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.example.typegraph.typegraph.TypeNode#getFlag <em>Flag</em>}</li>
 *   <li>{@link org.eclipse.glsp.example.typegraph.typegraph.TypeNode#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.example.typegraph.typegraph.ModelPackage#getTypeNode()
 * @model
 * @generated
 */
public interface TypeNode extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flag</em>' attribute.
	 * @see #setFlag(String)
	 * @see org.eclipse.glsp.example.typegraph.typegraph.ModelPackage#getTypeNode_Flag()
	 * @model
	 * @generated
	 */
	String getFlag();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeNode#getFlag <em>Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag</em>' attribute.
	 * @see #getFlag()
	 * @generated
	 */
	void setFlag(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.eclipse.glsp.example.typegraph.typegraph.ModelPackage#getTypeNode_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeNode#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // TypeNode
