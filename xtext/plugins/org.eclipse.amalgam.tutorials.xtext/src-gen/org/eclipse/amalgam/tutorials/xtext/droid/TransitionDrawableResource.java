/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Drawable Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.TransitionDrawableResource#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.TransitionDrawableResource#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getTransitionDrawableResource()
 * @model
 * @generated
 */
public interface TransitionDrawableResource extends DrawableResource
{
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(DrawableResource)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getTransitionDrawableResource_From()
   * @model
   * @generated
   */
  DrawableResource getFrom();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.TransitionDrawableResource#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(DrawableResource value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(DrawableResource)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getTransitionDrawableResource_To()
   * @model
   * @generated
   */
  DrawableResource getTo();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.TransitionDrawableResource#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(DrawableResource value);

} // TransitionDrawableResource
