/**
 */
package mozilla_td;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linkable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mozilla_td.Linkable#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see mozilla_td.Mozilla_tdPackage#getLinkable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Linkable extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link mozilla_td.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see mozilla_td.Mozilla_tdPackage#getLinkable_Links()
	 * @model required="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // Linkable
