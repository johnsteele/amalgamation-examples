/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.RelativeLayout#getLayoutParams <em>Layout Params</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.RelativeLayout#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getRelativeLayout()
 * @model
 * @generated
 */
public interface RelativeLayout extends Layout {
	/**
	 * Returns the value of the '<em><b>Layout Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Params</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Params</em>' containment reference.
	 * @see #setLayoutParams(LayoutParams)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getRelativeLayout_LayoutParams()
	 * @model containment="true"
	 * @generated
	 */
	LayoutParams getLayoutParams();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.RelativeLayout#getLayoutParams <em>Layout Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Params</em>' containment reference.
	 * @see #getLayoutParams()
	 * @generated
	 */
	void setLayoutParams(LayoutParams value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.tutorials.emf.droid.LayoutOrientationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutOrientationKind
	 * @see #setOrientation(LayoutOrientationKind)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getRelativeLayout_Orientation()
	 * @model
	 * @generated
	 */
	LayoutOrientationKind getOrientation();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.RelativeLayout#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutOrientationKind
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(LayoutOrientationKind value);

} // RelativeLayout
