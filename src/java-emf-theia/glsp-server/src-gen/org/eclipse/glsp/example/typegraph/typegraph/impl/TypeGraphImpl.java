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
package org.eclipse.glsp.example.typegraph.typegraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.glsp.example.typegraph.typegraph.ModelPackage;
import org.eclipse.glsp.example.typegraph.typegraph.TypeEdge;
import org.eclipse.glsp.example.typegraph.typegraph.TypeGraph;
import org.eclipse.glsp.example.typegraph.typegraph.TypeNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.example.typegraph.typegraph.impl.TypeGraphImpl#getTypenodes <em>Typenodes</em>}</li>
 *   <li>{@link org.eclipse.glsp.example.typegraph.typegraph.impl.TypeGraphImpl#getTypeedges <em>Typeedges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeGraphImpl extends IdentifiableImpl implements TypeGraph {
	/**
	 * The cached value of the '{@link #getTypenodes() <em>Typenodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypenodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeNode> typenodes;

	/**
	 * The cached value of the '{@link #getTypeedges() <em>Typeedges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeedges()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEdge> typeedges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TYPE_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeNode> getTypenodes() {
		if (typenodes == null) {
			typenodes = new EObjectContainmentEList<TypeNode>(TypeNode.class, this, ModelPackage.TYPE_GRAPH__TYPENODES);
		}
		return typenodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeEdge> getTypeedges() {
		if (typeedges == null) {
			typeedges = new EObjectContainmentEList<TypeEdge>(TypeEdge.class, this, ModelPackage.TYPE_GRAPH__TYPEEDGES);
		}
		return typeedges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TYPE_GRAPH__TYPENODES:
				return ((InternalEList<?>)getTypenodes()).basicRemove(otherEnd, msgs);
			case ModelPackage.TYPE_GRAPH__TYPEEDGES:
				return ((InternalEList<?>)getTypeedges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TYPE_GRAPH__TYPENODES:
				return getTypenodes();
			case ModelPackage.TYPE_GRAPH__TYPEEDGES:
				return getTypeedges();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.TYPE_GRAPH__TYPENODES:
				getTypenodes().clear();
				getTypenodes().addAll((Collection<? extends TypeNode>)newValue);
				return;
			case ModelPackage.TYPE_GRAPH__TYPEEDGES:
				getTypeedges().clear();
				getTypeedges().addAll((Collection<? extends TypeEdge>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.TYPE_GRAPH__TYPENODES:
				getTypenodes().clear();
				return;
			case ModelPackage.TYPE_GRAPH__TYPEEDGES:
				getTypeedges().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.TYPE_GRAPH__TYPENODES:
				return typenodes != null && !typenodes.isEmpty();
			case ModelPackage.TYPE_GRAPH__TYPEEDGES:
				return typeedges != null && !typeedges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeGraphImpl
