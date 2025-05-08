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
package org.eclipse.glsp.example.tasklist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.glsp.example.tasklist.model.FMCheck#getTasks <em>Tasks</em>}</li>
 * <li>{@link org.eclipse.glsp.example.tasklist.model.FMCheck#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.example.tasklist.model.ModelPackage#getFMCheck()
 * @model
 * @generated
 */
public interface FMCheck extends Identifiable {
   /**
    * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.glsp.example.tasklist.model.Task}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Tasks</em>' containment reference list.
    * @see org.eclipse.glsp.example.tasklist.model.ModelPackage#getFMCheck_Tasks()
    * @model containment="true"
    * @generated
    */
   EList<Task> getTasks();

   /**
    * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.glsp.example.tasklist.model.Transition}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Transitions</em>' containment reference list.
    * @see org.eclipse.glsp.example.tasklist.model.ModelPackage#getFMCheck_Transitions()
    * @model containment="true"
    * @generated
    */
   EList<Transition> getTransitions();

} // FMCheck
