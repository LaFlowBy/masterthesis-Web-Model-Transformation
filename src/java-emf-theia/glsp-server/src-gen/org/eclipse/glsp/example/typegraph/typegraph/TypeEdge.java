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
 * A representation of the model object '<em><b>Type Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#isIsApart <em>Is Apart</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.example.typegraph.typegraph.ModelPackage#getTypeEdge()
 * @model
 * @generated
 */
public interface TypeEdge extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TypeNode)
	 * @see org.eclipse.glsp.example.typegraph.typegraph.ModelPackage#getTypeEdge_Source()
	 * @model required="true"
	 * @generated
	 */
	TypeNode getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TypeNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TypeNode)
	 * @see org.eclipse.glsp.example.typegraph.typegraph.ModelPackage#getTypeEdge_Target()
	 * @model required="true"
	 * @generated
	 */
	TypeNode getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TypeNode value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.eclipse.glsp.example.typegraph.typegraph.ModelPackage#getTypeEdge_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Is Apart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Apart</em>' attribute.
	 * @see #setIsApart(boolean)
	 * @see org.eclipse.glsp.example.typegraph.typegraph.ModelPackage#getTypeEdge_IsApart()
	 * @model
	 * @generated
	 */
	boolean isIsApart();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#isIsApart <em>Is Apart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Apart</em>' attribute.
	 * @see #isIsApart()
	 * @generated
	 */
	void setIsApart(boolean value);

} // TypeEdge
