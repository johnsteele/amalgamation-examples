/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.BitmapDrawableResource;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bitmap Drawable Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.BitmapDrawableResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.BitmapDrawableResourceImpl#getFilename <em>Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitmapDrawableResourceImpl extends DrawableResourceImpl implements BitmapDrawableResource
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilename()
   * @generated
   * @ordered
   */
  protected static final String FILENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilename()
   * @generated
   * @ordered
   */
  protected String filename = FILENAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BitmapDrawableResourceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DroidPackage.Literals.BITMAP_DRAWABLE_RESOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.BITMAP_DRAWABLE_RESOURCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFilename()
  {
    return filename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilename(String newFilename)
  {
    String oldFilename = filename;
    filename = newFilename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.BITMAP_DRAWABLE_RESOURCE__FILENAME, oldFilename, filename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DroidPackage.BITMAP_DRAWABLE_RESOURCE__NAME:
        return getName();
      case DroidPackage.BITMAP_DRAWABLE_RESOURCE__FILENAME:
        return getFilename();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DroidPackage.BITMAP_DRAWABLE_RESOURCE__NAME:
        setName((String)newValue);
        return;
      case DroidPackage.BITMAP_DRAWABLE_RESOURCE__FILENAME:
        setFilename((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DroidPackage.BITMAP_DRAWABLE_RESOURCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DroidPackage.BITMAP_DRAWABLE_RESOURCE__FILENAME:
        setFilename(FILENAME_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DroidPackage.BITMAP_DRAWABLE_RESOURCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DroidPackage.BITMAP_DRAWABLE_RESOURCE__FILENAME:
        return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", filename: ");
    result.append(filename);
    result.append(')');
    return result.toString();
  }

} //BitmapDrawableResourceImpl
