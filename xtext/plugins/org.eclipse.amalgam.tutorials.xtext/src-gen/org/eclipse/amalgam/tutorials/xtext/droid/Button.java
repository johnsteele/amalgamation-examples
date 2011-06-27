/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Button#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Button#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Button#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Button#getHint <em>Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Widget, AbstractTextView
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(StringVA)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getButton_Text()
   * @model containment="true"
   * @generated
   */
  StringVA getText();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Button#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(StringVA value);

  /**
   * Returns the value of the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' containment reference.
   * @see #setImage(AnyDrawableVA)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getButton_Image()
   * @model containment="true"
   * @generated
   */
  AnyDrawableVA getImage();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Button#getImage <em>Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' containment reference.
   * @see #getImage()
   * @generated
   */
  void setImage(AnyDrawableVA value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Activity)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getButton_Target()
   * @model
   * @generated
   */
  Activity getTarget();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Button#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Activity value);

  /**
   * Returns the value of the '<em><b>Hint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hint</em>' containment reference.
   * @see #setHint(StringVA)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getButton_Hint()
   * @model containment="true"
   * @generated
   */
  StringVA getHint();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Button#getHint <em>Hint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hint</em>' containment reference.
   * @see #getHint()
   * @generated
   */
  void setHint(StringVA value);

} // Button