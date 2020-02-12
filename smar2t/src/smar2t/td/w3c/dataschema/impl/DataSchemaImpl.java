/**
 */
package smar2t.td.w3c.dataschema.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import smar2t.td.w3c.core.MultiLanguage;

import smar2t.td.w3c.dataschema.DataSchema;
import smar2t.td.w3c.dataschema.DataschemaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.dataschema.impl.DataSchemaImpl#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.impl.DataSchemaImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.impl.DataSchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.impl.DataSchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.impl.DataSchemaImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.impl.DataSchemaImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.impl.DataSchemaImpl#getOneOf <em>One Of</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.impl.DataSchemaImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.impl.DataSchemaImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.impl.DataSchemaImpl#getConst <em>Const</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.impl.DataSchemaImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.impl.DataSchemaImpl#isWriteOnly <em>Write Only</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.impl.DataSchemaImpl#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataSchemaImpl extends MinimalEObjectImpl.Container implements DataSchema {
	/**
	 * The cached value of the '{@link #getSemanticType() <em>Semantic Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> semanticType;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected static final String ENUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected String enum_ = ENUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOneOf() <em>One Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneOf()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSchema> oneOf;

	/**
	 * The cached value of the '{@link #getTitles() <em>Titles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitles()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiLanguage> titles;

	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiLanguage> descriptions;

	/**
	 * The default value of the '{@link #getConst() <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConst()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConst() <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConst()
	 * @generated
	 * @ordered
	 */
	protected Object const_ = CONST_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isWriteOnly() <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITE_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWriteOnly() <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean writeOnly = WRITE_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataschemaPackage.Literals.DATA_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSemanticType() {
		if (semanticType == null) {
			semanticType = new EDataTypeUniqueEList<String>(String.class, this, DataschemaPackage.DATA_SCHEMA__SEMANTIC_TYPE);
		}
		return semanticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataschemaPackage.DATA_SCHEMA__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataschemaPackage.DATA_SCHEMA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataschemaPackage.DATA_SCHEMA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataschemaPackage.DATA_SCHEMA__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnum() {
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnum(String newEnum) {
		String oldEnum = enum_;
		enum_ = newEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataschemaPackage.DATA_SCHEMA__ENUM, oldEnum, enum_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSchema> getOneOf() {
		if (oneOf == null) {
			oneOf = new EObjectResolvingEList<DataSchema>(DataSchema.class, this, DataschemaPackage.DATA_SCHEMA__ONE_OF);
		}
		return oneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiLanguage> getTitles() {
		if (titles == null) {
			titles = new EObjectResolvingEList<MultiLanguage>(MultiLanguage.class, this, DataschemaPackage.DATA_SCHEMA__TITLES);
		}
		return titles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiLanguage> getDescriptions() {
		if (descriptions == null) {
			descriptions = new EObjectResolvingEList<MultiLanguage>(MultiLanguage.class, this, DataschemaPackage.DATA_SCHEMA__DESCRIPTIONS);
		}
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConst() {
		return const_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConst(Object newConst) {
		Object oldConst = const_;
		const_ = newConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataschemaPackage.DATA_SCHEMA__CONST, oldConst, const_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataschemaPackage.DATA_SCHEMA__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWriteOnly() {
		return writeOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteOnly(boolean newWriteOnly) {
		boolean oldWriteOnly = writeOnly;
		writeOnly = newWriteOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataschemaPackage.DATA_SCHEMA__WRITE_ONLY, oldWriteOnly, writeOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataschemaPackage.DATA_SCHEMA__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataschemaPackage.DATA_SCHEMA__SEMANTIC_TYPE:
				return getSemanticType();
			case DataschemaPackage.DATA_SCHEMA__TITLE:
				return getTitle();
			case DataschemaPackage.DATA_SCHEMA__DESCRIPTION:
				return getDescription();
			case DataschemaPackage.DATA_SCHEMA__TYPE:
				return getType();
			case DataschemaPackage.DATA_SCHEMA__UNIT:
				return getUnit();
			case DataschemaPackage.DATA_SCHEMA__ENUM:
				return getEnum();
			case DataschemaPackage.DATA_SCHEMA__ONE_OF:
				return getOneOf();
			case DataschemaPackage.DATA_SCHEMA__TITLES:
				return getTitles();
			case DataschemaPackage.DATA_SCHEMA__DESCRIPTIONS:
				return getDescriptions();
			case DataschemaPackage.DATA_SCHEMA__CONST:
				return getConst();
			case DataschemaPackage.DATA_SCHEMA__READ_ONLY:
				return isReadOnly();
			case DataschemaPackage.DATA_SCHEMA__WRITE_ONLY:
				return isWriteOnly();
			case DataschemaPackage.DATA_SCHEMA__FORMAT:
				return getFormat();
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
			case DataschemaPackage.DATA_SCHEMA__SEMANTIC_TYPE:
				getSemanticType().clear();
				getSemanticType().addAll((Collection<? extends String>)newValue);
				return;
			case DataschemaPackage.DATA_SCHEMA__TITLE:
				setTitle((String)newValue);
				return;
			case DataschemaPackage.DATA_SCHEMA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DataschemaPackage.DATA_SCHEMA__TYPE:
				setType((String)newValue);
				return;
			case DataschemaPackage.DATA_SCHEMA__UNIT:
				setUnit((String)newValue);
				return;
			case DataschemaPackage.DATA_SCHEMA__ENUM:
				setEnum((String)newValue);
				return;
			case DataschemaPackage.DATA_SCHEMA__ONE_OF:
				getOneOf().clear();
				getOneOf().addAll((Collection<? extends DataSchema>)newValue);
				return;
			case DataschemaPackage.DATA_SCHEMA__TITLES:
				getTitles().clear();
				getTitles().addAll((Collection<? extends MultiLanguage>)newValue);
				return;
			case DataschemaPackage.DATA_SCHEMA__DESCRIPTIONS:
				getDescriptions().clear();
				getDescriptions().addAll((Collection<? extends MultiLanguage>)newValue);
				return;
			case DataschemaPackage.DATA_SCHEMA__CONST:
				setConst(newValue);
				return;
			case DataschemaPackage.DATA_SCHEMA__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case DataschemaPackage.DATA_SCHEMA__WRITE_ONLY:
				setWriteOnly((Boolean)newValue);
				return;
			case DataschemaPackage.DATA_SCHEMA__FORMAT:
				setFormat((String)newValue);
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
			case DataschemaPackage.DATA_SCHEMA__SEMANTIC_TYPE:
				getSemanticType().clear();
				return;
			case DataschemaPackage.DATA_SCHEMA__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DataschemaPackage.DATA_SCHEMA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DataschemaPackage.DATA_SCHEMA__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DataschemaPackage.DATA_SCHEMA__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case DataschemaPackage.DATA_SCHEMA__ENUM:
				setEnum(ENUM_EDEFAULT);
				return;
			case DataschemaPackage.DATA_SCHEMA__ONE_OF:
				getOneOf().clear();
				return;
			case DataschemaPackage.DATA_SCHEMA__TITLES:
				getTitles().clear();
				return;
			case DataschemaPackage.DATA_SCHEMA__DESCRIPTIONS:
				getDescriptions().clear();
				return;
			case DataschemaPackage.DATA_SCHEMA__CONST:
				setConst(CONST_EDEFAULT);
				return;
			case DataschemaPackage.DATA_SCHEMA__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case DataschemaPackage.DATA_SCHEMA__WRITE_ONLY:
				setWriteOnly(WRITE_ONLY_EDEFAULT);
				return;
			case DataschemaPackage.DATA_SCHEMA__FORMAT:
				setFormat(FORMAT_EDEFAULT);
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
			case DataschemaPackage.DATA_SCHEMA__SEMANTIC_TYPE:
				return semanticType != null && !semanticType.isEmpty();
			case DataschemaPackage.DATA_SCHEMA__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DataschemaPackage.DATA_SCHEMA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DataschemaPackage.DATA_SCHEMA__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DataschemaPackage.DATA_SCHEMA__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case DataschemaPackage.DATA_SCHEMA__ENUM:
				return ENUM_EDEFAULT == null ? enum_ != null : !ENUM_EDEFAULT.equals(enum_);
			case DataschemaPackage.DATA_SCHEMA__ONE_OF:
				return oneOf != null && !oneOf.isEmpty();
			case DataschemaPackage.DATA_SCHEMA__TITLES:
				return titles != null && !titles.isEmpty();
			case DataschemaPackage.DATA_SCHEMA__DESCRIPTIONS:
				return descriptions != null && !descriptions.isEmpty();
			case DataschemaPackage.DATA_SCHEMA__CONST:
				return CONST_EDEFAULT == null ? const_ != null : !CONST_EDEFAULT.equals(const_);
			case DataschemaPackage.DATA_SCHEMA__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case DataschemaPackage.DATA_SCHEMA__WRITE_ONLY:
				return writeOnly != WRITE_ONLY_EDEFAULT;
			case DataschemaPackage.DATA_SCHEMA__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (semanticType: ");
		result.append(semanticType);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(", unit: ");
		result.append(unit);
		result.append(", enum: ");
		result.append(enum_);
		result.append(", const: ");
		result.append(const_);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", writeOnly: ");
		result.append(writeOnly);
		result.append(", format: ");
		result.append(format);
		result.append(')');
		return result.toString();
	}

} //DataSchemaImpl
