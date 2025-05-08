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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.glsp.example.typegraph.typegraph.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "typegraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/glsp/examples/tasklist";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "example-model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.eclipse.glsp.example.typegraph.typegraph.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.example.typegraph.typegraph.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.IdentifiableImpl
	 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.ModelPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.example.typegraph.typegraph.impl.TypeGraphImpl <em>Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.TypeGraphImpl
	 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.ModelPackageImpl#getTypeGraph()
	 * @generated
	 */
	int TYPE_GRAPH = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Typenodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__TYPENODES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Typeedges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__TYPEEDGES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.example.typegraph.typegraph.impl.TypeNodeImpl <em>Type Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.TypeNodeImpl
	 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.ModelPackageImpl#getTypeNode()
	 * @generated
	 */
	int TYPE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NODE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NODE__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NODE__FLAG = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NODE__COMMENT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NODE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NODE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.example.typegraph.typegraph.impl.TypeEdgeImpl <em>Type Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.TypeEdgeImpl
	 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.ModelPackageImpl#getTypeEdge()
	 * @generated
	 */
	int TYPE_EDGE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EDGE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EDGE__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EDGE__SOURCE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EDGE__TARGET = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EDGE__COMMENT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Apart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EDGE__IS_APART = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EDGE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Type Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EDGE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.example.typegraph.typegraph.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.example.typegraph.typegraph.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.example.typegraph.typegraph.Identifiable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.Identifiable#getName()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeGraph <em>Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Graph</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.TypeGraph
	 * @generated
	 */
	EClass getTypeGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeGraph#getTypenodes <em>Typenodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typenodes</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.TypeGraph#getTypenodes()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Typenodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeGraph#getTypeedges <em>Typeedges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typeedges</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.TypeGraph#getTypeedges()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Typeedges();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeNode <em>Type Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Node</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.TypeNode
	 * @generated
	 */
	EClass getTypeNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeNode#getFlag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.TypeNode#getFlag()
	 * @see #getTypeNode()
	 * @generated
	 */
	EAttribute getTypeNode_Flag();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeNode#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.TypeNode#getComment()
	 * @see #getTypeNode()
	 * @generated
	 */
	EAttribute getTypeNode_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge <em>Type Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Edge</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.TypeEdge
	 * @generated
	 */
	EClass getTypeEdge();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#getSource()
	 * @see #getTypeEdge()
	 * @generated
	 */
	EReference getTypeEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#getTarget()
	 * @see #getTypeEdge()
	 * @generated
	 */
	EReference getTypeEdge_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#getComment()
	 * @see #getTypeEdge()
	 * @generated
	 */
	EAttribute getTypeEdge_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#isIsApart <em>Is Apart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Apart</em>'.
	 * @see org.eclipse.glsp.example.typegraph.typegraph.TypeEdge#isIsApart()
	 * @see #getTypeEdge()
	 * @generated
	 */
	EAttribute getTypeEdge_IsApart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.example.typegraph.typegraph.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.IdentifiableImpl
		 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.ModelPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__NAME = eINSTANCE.getIdentifiable_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.example.typegraph.typegraph.impl.TypeGraphImpl <em>Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.TypeGraphImpl
		 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.ModelPackageImpl#getTypeGraph()
		 * @generated
		 */
		EClass TYPE_GRAPH = eINSTANCE.getTypeGraph();

		/**
		 * The meta object literal for the '<em><b>Typenodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__TYPENODES = eINSTANCE.getTypeGraph_Typenodes();

		/**
		 * The meta object literal for the '<em><b>Typeedges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__TYPEEDGES = eINSTANCE.getTypeGraph_Typeedges();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.example.typegraph.typegraph.impl.TypeNodeImpl <em>Type Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.TypeNodeImpl
		 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.ModelPackageImpl#getTypeNode()
		 * @generated
		 */
		EClass TYPE_NODE = eINSTANCE.getTypeNode();

		/**
		 * The meta object literal for the '<em><b>Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_NODE__FLAG = eINSTANCE.getTypeNode_Flag();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_NODE__COMMENT = eINSTANCE.getTypeNode_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.example.typegraph.typegraph.impl.TypeEdgeImpl <em>Type Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.TypeEdgeImpl
		 * @see org.eclipse.glsp.example.typegraph.typegraph.impl.ModelPackageImpl#getTypeEdge()
		 * @generated
		 */
		EClass TYPE_EDGE = eINSTANCE.getTypeEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_EDGE__SOURCE = eINSTANCE.getTypeEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_EDGE__TARGET = eINSTANCE.getTypeEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_EDGE__COMMENT = eINSTANCE.getTypeEdge_Comment();

		/**
		 * The meta object literal for the '<em><b>Is Apart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_EDGE__IS_APART = eINSTANCE.getTypeEdge_IsApart();

	}

} //ModelPackage
