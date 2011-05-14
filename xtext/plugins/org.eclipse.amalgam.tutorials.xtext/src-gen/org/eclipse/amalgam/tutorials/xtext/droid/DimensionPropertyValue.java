/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getDimensionPropertyValue()
 * @model
 * @generated
 */
public interface DimensionPropertyValue extends PropertyValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(Float)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getDimensionPropertyValue_Value()
   * @model
   * @generated
   */
  Float getValue();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(Float value);

  /**
   * Returns the value of the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' reference.
   * @see #setResource(DimensionValueResource)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getDimensionPropertyValue_Resource()
   * @model
   * @generated
   */
  DimensionValueResource getResource();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue#getResource <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' reference.
   * @see #getResource()
   * @generated
   */
  void setResource(DimensionValueResource value);

} // DimensionPropertyValue