/**
 */
package smar2t.td.mozilla.core;

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
 *   <li>{@link smar2t.td.mozilla.core.Linkable#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see smar2t.td.mozilla.core.CorePackage#getLinkable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Linkable extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link smar2t.td.mozilla.core.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see smar2t.td.mozilla.core.CorePackage#getLinkable_Links()
	 * @model required="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // Linkable
