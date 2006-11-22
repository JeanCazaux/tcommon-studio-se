/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.component;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.designer.core.model.utils.emf.component.ComponentFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface ComponentPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "org.talend.designer.core.model.utils.emf.component";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "platform:/resource/org.talend.model/model/Component.xsd";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "Component";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ComponentPackage eINSTANCE = org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.CODEGENERATIONTypeImpl <em>CODEGENERATION Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.CODEGENERATIONTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getCODEGENERATIONType()
     * @generated
     */
    int CODEGENERATION_TYPE = 0;

    /**
     * The feature id for the '<em><b>TEMPLATES</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CODEGENERATION_TYPE__TEMPLATES = 0;

    /**
     * The feature id for the '<em><b>IMPORTS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CODEGENERATION_TYPE__IMPORTS = 1;

    /**
     * The number of structural features of the '<em>CODEGENERATION Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CODEGENERATION_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl <em>COMPONENT Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getCOMPONENTType()
     * @generated
     */
    int COMPONENT_TYPE = 1;

    /**
     * The feature id for the '<em><b>HEADER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_TYPE__HEADER = 0;

    /**
     * The feature id for the '<em><b>DOCUMENTATION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_TYPE__DOCUMENTATION = 1;

    /**
     * The feature id for the '<em><b>CONNECTORS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_TYPE__CONNECTORS = 2;

    /**
     * The feature id for the '<em><b>PARAMETERS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_TYPE__PARAMETERS = 3;

    /**
     * The feature id for the '<em><b>CODEGENERATION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_TYPE__CODEGENERATION = 4;

    /**
     * The feature id for the '<em><b>RETURNS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_TYPE__RETURNS = 5;

    /**
     * The number of structural features of the '<em>COMPONENT Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.CONNECTORSTypeImpl <em>CONNECTORS Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.CONNECTORSTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getCONNECTORSType()
     * @generated
     */
    int CONNECTORS_TYPE = 2;

    /**
     * The feature id for the '<em><b>CONNECTOR</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTORS_TYPE__CONNECTOR = 0;

    /**
     * The number of structural features of the '<em>CONNECTORS Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTORS_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.CONNECTORTypeImpl <em>CONNECTOR Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.CONNECTORTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getCONNECTORType()
     * @generated
     */
    int CONNECTOR_TYPE = 3;

    /**
     * The feature id for the '<em><b>BUILTIN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__BUILTIN = 0;

    /**
     * The feature id for the '<em><b>CTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__CTYPE = 1;

    /**
     * The feature id for the '<em><b>MAXINPUT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__MAXINPUT = 2;

    /**
     * The feature id for the '<em><b>MAXOUTPUT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__MAXOUTPUT = 3;

    /**
     * The feature id for the '<em><b>MININPUT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__MININPUT = 4;

    /**
     * The feature id for the '<em><b>MINOUTPUT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__MINOUTPUT = 5;

    /**
     * The number of structural features of the '<em>CONNECTOR Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.DEFAULTTypeImpl <em>DEFAULT Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.DEFAULTTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getDEFAULTType()
     * @generated
     */
    int DEFAULT_TYPE = 4;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_TYPE__VALUE = 0;

    /**
     * The feature id for the '<em><b>IF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_TYPE__IF = 1;

    /**
     * The feature id for the '<em><b>NOTIF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_TYPE__NOTIF = 2;

    /**
     * The number of structural features of the '<em>DEFAULT Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.DOCUMENTATIONTypeImpl <em>DOCUMENTATION Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.DOCUMENTATIONTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getDOCUMENTATIONType()
     * @generated
     */
    int DOCUMENTATION_TYPE = 5;

    /**
     * The feature id for the '<em><b>URL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_TYPE__URL = 0;

    /**
     * The number of structural features of the '<em>DOCUMENTATION Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 6;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>CODEGENERATION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CODEGENERATION = 3;

    /**
     * The feature id for the '<em><b>COMPONENT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COMPONENT = 4;

    /**
     * The feature id for the '<em><b>CONNECTORS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONNECTORS = 5;

    /**
     * The feature id for the '<em><b>DOCUMENTATION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DOCUMENTATION = 6;

    /**
     * The feature id for the '<em><b>HEADER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__HEADER = 7;

    /**
     * The feature id for the '<em><b>ITEMS</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__ITEMS = 8;

    /**
     * The feature id for the '<em><b>PARAMETERS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARAMETERS = 9;

    /**
     * The feature id for the '<em><b>RETURNS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RETURNS = 10;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 11;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.HEADERTypeImpl <em>HEADER Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.HEADERTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getHEADERType()
     * @generated
     */
    int HEADER_TYPE = 7;

    /**
     * The feature id for the '<em><b>SIGNATURE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__SIGNATURE = 0;

    /**
     * The feature id for the '<em><b>AUTHOR</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__AUTHOR = 1;

    /**
     * The feature id for the '<em><b>COMPATIBILITY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__COMPATIBILITY = 2;

    /**
     * The feature id for the '<em><b>DATAAUTOPROPAGATE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__DATAAUTOPROPAGATE = 3;

    /**
     * The feature id for the '<em><b>DISPLAY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__DISPLAY = 4;

    /**
     * The feature id for the '<em><b>EXTENSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__EXTENSION = 5;

    /**
     * The feature id for the '<em><b>ICON16</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__ICON16 = 6;

    /**
     * The feature id for the '<em><b>ICON24</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__ICON24 = 7;

    /**
     * The feature id for the '<em><b>ICON32</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__ICON32 = 8;

    /**
     * The feature id for the '<em><b>PLATEFORM</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__PLATEFORM = 9;

    /**
     * The feature id for the '<em><b>RELEASEDATE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__RELEASEDATE = 10;

    /**
     * The feature id for the '<em><b>SCHEMAAUTOPROPAGATE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__SCHEMAAUTOPROPAGATE = 11;

    /**
     * The feature id for the '<em><b>SERIAL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__SERIAL = 12;

    /**
     * The feature id for the '<em><b>STARTABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__STARTABLE = 13;

    /**
     * The feature id for the '<em><b>STATUS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__STATUS = 14;

    /**
     * The feature id for the '<em><b>VERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE__VERSION = 15;

    /**
     * The number of structural features of the '<em>HEADER Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_TYPE_FEATURE_COUNT = 16;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTSTypeImpl <em>IMPORTS Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.IMPORTSTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getIMPORTSType()
     * @generated
     */
    int IMPORTS_TYPE = 8;

    /**
     * The feature id for the '<em><b>IMPORT</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTS_TYPE__IMPORT = 0;

    /**
     * The number of structural features of the '<em>IMPORTS Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTS_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl <em>IMPORT Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getIMPORTType()
     * @generated
     */
    int IMPORT_TYPE = 9;

    /**
     * The feature id for the '<em><b>MODULE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__MODULE = 0;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>REQUIRED</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__REQUIRED = 2;

    /**
     * The number of structural features of the '<em>IMPORT Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMSTypeImpl <em>ITEMS Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.ITEMSTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getITEMSType()
     * @generated
     */
    int ITEMS_TYPE = 10;

    /**
     * The feature id for the '<em><b>ITEM</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEMS_TYPE__ITEM = 0;

    /**
     * The feature id for the '<em><b>BASEDONSCHEMA</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEMS_TYPE__BASEDONSCHEMA = 1;

    /**
     * The feature id for the '<em><b>DEFAULT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEMS_TYPE__DEFAULT = 2;

    /**
     * The number of structural features of the '<em>ITEMS Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEMS_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl <em>ITEM Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getITEMType()
     * @generated
     */
    int ITEM_TYPE = 11;

    /**
     * The feature id for the '<em><b>ITEMS</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ITEM_TYPE__ITEMS = 0;

    /**
     * The feature id for the '<em><b>FIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ITEM_TYPE__FIELD = 1;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_TYPE__NAME = 2;

    /**
     * The feature id for the '<em><b>NOTSHOWIF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_TYPE__NOTSHOWIF = 3;

    /**
     * The feature id for the '<em><b>REPOSITORYITEM</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_TYPE__REPOSITORYITEM = 4;

    /**
     * The feature id for the '<em><b>SHOWIF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_TYPE__SHOWIF = 5;

    /**
     * The feature id for the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_TYPE__VALUE = 6;

    /**
     * The number of structural features of the '<em>ITEM Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_TYPE_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.LINKTOTypeImpl <em>LINKTO Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.LINKTOTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getLINKTOType()
     * @generated
     */
    int LINKTO_TYPE = 12;

    /**
     * The feature id for the '<em><b>CTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKTO_TYPE__CTYPE = 0;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKTO_TYPE__NAME = 1;

    /**
     * The number of structural features of the '<em>LINKTO Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKTO_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERSTypeImpl <em>PARAMETERS Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.PARAMETERSTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getPARAMETERSType()
     * @generated
     */
    int PARAMETERS_TYPE = 13;

    /**
     * The feature id for the '<em><b>PARAMETER</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETERS_TYPE__PARAMETER = 0;

    /**
     * The number of structural features of the '<em>PARAMETERS Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETERS_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl <em>PARAMETER Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getPARAMETERType()
     * @generated
     */
    int PARAMETER_TYPE = 14;

    /**
     * The feature id for the '<em><b>DEFAULT</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__DEFAULT = 0;

    /**
     * The feature id for the '<em><b>ITEMS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__ITEMS = 1;

    /**
     * The feature id for the '<em><b>FIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__FIELD = 2;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__NAME = 3;

    /**
     * The feature id for the '<em><b>NBLINES</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__NBLINES = 4;

    /**
     * The feature id for the '<em><b>NOTSHOWIF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__NOTSHOWIF = 5;

    /**
     * The feature id for the '<em><b>NUMROW</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__NUMROW = 6;

    /**
     * The feature id for the '<em><b>READONLY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__READONLY = 7;

    /**
     * The feature id for the '<em><b>REPOSITORYVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__REPOSITORYVALUE = 8;

    /**
     * The feature id for the '<em><b>REQUIRED</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__REQUIRED = 9;

    /**
     * The feature id for the '<em><b>SHOW</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__SHOW = 10;

    /**
     * The feature id for the '<em><b>SHOWIF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__SHOWIF = 11;

    /**
     * The number of structural features of the '<em>PARAMETER Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE_FEATURE_COUNT = 12;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.RETURNSTypeImpl <em>RETURNS Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.RETURNSTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getRETURNSType()
     * @generated
     */
    int RETURNS_TYPE = 15;

    /**
     * The feature id for the '<em><b>RETURN</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURNS_TYPE__RETURN = 0;

    /**
     * The number of structural features of the '<em>RETURNS Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURNS_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.RETURNTypeImpl <em>RETURN Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.RETURNTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getRETURNType()
     * @generated
     */
    int RETURN_TYPE = 16;

    /**
     * The feature id for the '<em><b>AVAILABILITY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN_TYPE__AVAILABILITY = 0;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN_TYPE__TYPE = 2;

    /**
     * The number of structural features of the '<em>RETURN Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATEPARAMTypeImpl <em>TEMPLATEPARAM Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.TEMPLATEPARAMTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getTEMPLATEPARAMType()
     * @generated
     */
    int TEMPLATEPARAM_TYPE = 17;

    /**
     * The feature id for the '<em><b>SOURCE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATEPARAM_TYPE__SOURCE = 0;

    /**
     * The feature id for the '<em><b>TARGET</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATEPARAM_TYPE__TARGET = 1;

    /**
     * The number of structural features of the '<em>TEMPLATEPARAM Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATEPARAM_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATESTypeImpl <em>TEMPLATES Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.TEMPLATESTypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getTEMPLATESType()
     * @generated
     */
    int TEMPLATES_TYPE = 18;

    /**
     * The feature id for the '<em><b>TEMPLATE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATES_TYPE__TEMPLATE = 0;

    /**
     * The feature id for the '<em><b>TEMPLATEPARAM</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATES_TYPE__TEMPLATEPARAM = 1;

    /**
     * The feature id for the '<em><b>INPUT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATES_TYPE__INPUT = 2;

    /**
     * The feature id for the '<em><b>OUTPUT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATES_TYPE__OUTPUT = 3;

    /**
     * The number of structural features of the '<em>TEMPLATES Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATES_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATETypeImpl <em>TEMPLATE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.component.impl.TEMPLATETypeImpl
     * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getTEMPLATEType()
     * @generated
     */
    int TEMPLATE_TYPE = 19;

    /**
     * The feature id for the '<em><b>LINKTO</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__LINKTO = 0;

    /**
     * The feature id for the '<em><b>COMPONENT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__COMPONENT = 1;

    /**
     * The feature id for the '<em><b>MULTIPLEMETHODS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__MULTIPLEMETHODS = 2;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__NAME = 3;

    /**
     * The number of structural features of the '<em>TEMPLATE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE_FEATURE_COUNT = 4;


    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType <em>CODEGENERATION Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CODEGENERATION Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType
     * @generated
     */
    EClass getCODEGENERATIONType();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType#getTEMPLATES <em>TEMPLATES</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TEMPLATES</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType#getTEMPLATES()
     * @see #getCODEGENERATIONType()
     * @generated
     */
    EReference getCODEGENERATIONType_TEMPLATES();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType#getIMPORTS <em>IMPORTS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>IMPORTS</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType#getIMPORTS()
     * @see #getCODEGENERATIONType()
     * @generated
     */
    EReference getCODEGENERATIONType_IMPORTS();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType <em>COMPONENT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>COMPONENT Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.COMPONENTType
     * @generated
     */
    EClass getCOMPONENTType();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getHEADER <em>HEADER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>HEADER</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.COMPONENTType#getHEADER()
     * @see #getCOMPONENTType()
     * @generated
     */
    EReference getCOMPONENTType_HEADER();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getDOCUMENTATION <em>DOCUMENTATION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>DOCUMENTATION</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.COMPONENTType#getDOCUMENTATION()
     * @see #getCOMPONENTType()
     * @generated
     */
    EReference getCOMPONENTType_DOCUMENTATION();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getCONNECTORS <em>CONNECTORS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CONNECTORS</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.COMPONENTType#getCONNECTORS()
     * @see #getCOMPONENTType()
     * @generated
     */
    EReference getCOMPONENTType_CONNECTORS();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getPARAMETERS <em>PARAMETERS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>PARAMETERS</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.COMPONENTType#getPARAMETERS()
     * @see #getCOMPONENTType()
     * @generated
     */
    EReference getCOMPONENTType_PARAMETERS();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getCODEGENERATION <em>CODEGENERATION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CODEGENERATION</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.COMPONENTType#getCODEGENERATION()
     * @see #getCOMPONENTType()
     * @generated
     */
    EReference getCOMPONENTType_CODEGENERATION();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getRETURNS <em>RETURNS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>RETURNS</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.COMPONENTType#getRETURNS()
     * @see #getCOMPONENTType()
     * @generated
     */
    EReference getCOMPONENTType_RETURNS();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORSType <em>CONNECTORS Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CONNECTORS Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.CONNECTORSType
     * @generated
     */
    EClass getCONNECTORSType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORSType#getCONNECTOR <em>CONNECTOR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>CONNECTOR</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.CONNECTORSType#getCONNECTOR()
     * @see #getCONNECTORSType()
     * @generated
     */
    EReference getCONNECTORSType_CONNECTOR();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType <em>CONNECTOR Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CONNECTOR Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.CONNECTORType
     * @generated
     */
    EClass getCONNECTORType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#isBUILTIN <em>BUILTIN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>BUILTIN</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.CONNECTORType#isBUILTIN()
     * @see #getCONNECTORType()
     * @generated
     */
    EAttribute getCONNECTORType_BUILTIN();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getCTYPE <em>CTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CTYPE</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.CONNECTORType#getCTYPE()
     * @see #getCONNECTORType()
     * @generated
     */
    EAttribute getCONNECTORType_CTYPE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMAXINPUT <em>MAXINPUT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MAXINPUT</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMAXINPUT()
     * @see #getCONNECTORType()
     * @generated
     */
    EAttribute getCONNECTORType_MAXINPUT();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMAXOUTPUT <em>MAXOUTPUT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MAXOUTPUT</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMAXOUTPUT()
     * @see #getCONNECTORType()
     * @generated
     */
    EAttribute getCONNECTORType_MAXOUTPUT();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMININPUT <em>MININPUT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MININPUT</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMININPUT()
     * @see #getCONNECTORType()
     * @generated
     */
    EAttribute getCONNECTORType_MININPUT();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMINOUTPUT <em>MINOUTPUT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MINOUTPUT</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMINOUTPUT()
     * @see #getCONNECTORType()
     * @generated
     */
    EAttribute getCONNECTORType_MINOUTPUT();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.DEFAULTType <em>DEFAULT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>DEFAULT Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DEFAULTType
     * @generated
     */
    EClass getDEFAULTType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.DEFAULTType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DEFAULTType#getValue()
     * @see #getDEFAULTType()
     * @generated
     */
    EAttribute getDEFAULTType_Value();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.DEFAULTType#getIF <em>IF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>IF</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DEFAULTType#getIF()
     * @see #getDEFAULTType()
     * @generated
     */
    EAttribute getDEFAULTType_IF();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.DEFAULTType#getNOTIF <em>NOTIF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NOTIF</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DEFAULTType#getNOTIF()
     * @see #getDEFAULTType()
     * @generated
     */
    EAttribute getDEFAULTType_NOTIF();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.DOCUMENTATIONType <em>DOCUMENTATION Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>DOCUMENTATION Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DOCUMENTATIONType
     * @generated
     */
    EClass getDOCUMENTATIONType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.DOCUMENTATIONType#getURL <em>URL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>URL</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DOCUMENTATIONType#getURL()
     * @see #getDOCUMENTATIONType()
     * @generated
     */
    EAttribute getDOCUMENTATIONType_URL();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getCODEGENERATION <em>CODEGENERATION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CODEGENERATION</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DocumentRoot#getCODEGENERATION()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CODEGENERATION();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getCOMPONENT <em>COMPONENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>COMPONENT</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DocumentRoot#getCOMPONENT()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_COMPONENT();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getCONNECTORS <em>CONNECTORS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CONNECTORS</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DocumentRoot#getCONNECTORS()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CONNECTORS();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getDOCUMENTATION <em>DOCUMENTATION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>DOCUMENTATION</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DocumentRoot#getDOCUMENTATION()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DOCUMENTATION();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getHEADER <em>HEADER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>HEADER</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DocumentRoot#getHEADER()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_HEADER();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getITEMS <em>ITEMS</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>ITEMS</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DocumentRoot#getITEMS()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ITEMS();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getPARAMETERS <em>PARAMETERS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>PARAMETERS</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DocumentRoot#getPARAMETERS()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PARAMETERS();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getRETURNS <em>RETURNS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>RETURNS</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.DocumentRoot#getRETURNS()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_RETURNS();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.HEADERType <em>HEADER Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>HEADER Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType
     * @generated
     */
    EClass getHEADERType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getSIGNATURE <em>SIGNATURE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SIGNATURE</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#getSIGNATURE()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_SIGNATURE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getAUTHOR <em>AUTHOR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>AUTHOR</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#getAUTHOR()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_AUTHOR();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getCOMPATIBILITY <em>COMPATIBILITY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>COMPATIBILITY</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#getCOMPATIBILITY()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_COMPATIBILITY();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isDATAAUTOPROPAGATE <em>DATAAUTOPROPAGATE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATAAUTOPROPAGATE</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#isDATAAUTOPROPAGATE()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_DATAAUTOPROPAGATE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isDISPLAY <em>DISPLAY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DISPLAY</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#isDISPLAY()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_DISPLAY();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getEXTENSION <em>EXTENSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>EXTENSION</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#getEXTENSION()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_EXTENSION();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getICON32 <em>ICON32</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ICON32</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#getICON32()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_ICON32();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getPLATEFORM <em>PLATEFORM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PLATEFORM</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#getPLATEFORM()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_PLATEFORM();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getRELEASEDATE <em>RELEASEDATE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>RELEASEDATE</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#getRELEASEDATE()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_RELEASEDATE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isSCHEMAAUTOPROPAGATE <em>SCHEMAAUTOPROPAGATE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SCHEMAAUTOPROPAGATE</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#isSCHEMAAUTOPROPAGATE()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_SCHEMAAUTOPROPAGATE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getSERIAL <em>SERIAL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SERIAL</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#getSERIAL()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_SERIAL();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isSTARTABLE <em>STARTABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>STARTABLE</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#isSTARTABLE()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_STARTABLE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getSTATUS <em>STATUS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>STATUS</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#getSTATUS()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_STATUS();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getVERSION <em>VERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSION</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#getVERSION()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_VERSION();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getICON24 <em>ICON24</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ICON24</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#getICON24()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_ICON24();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getICON16 <em>ICON16</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ICON16</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType#getICON16()
     * @see #getHEADERType()
     * @generated
     */
    EAttribute getHEADERType_ICON16();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.IMPORTSType <em>IMPORTS Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IMPORTS Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.IMPORTSType
     * @generated
     */
    EClass getIMPORTSType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.component.IMPORTSType#getIMPORT <em>IMPORT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>IMPORT</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.IMPORTSType#getIMPORT()
     * @see #getIMPORTSType()
     * @generated
     */
    EReference getIMPORTSType_IMPORT();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType <em>IMPORT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IMPORT Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.IMPORTType
     * @generated
     */
    EClass getIMPORTType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getMODULE <em>MODULE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MODULE</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.IMPORTType#getMODULE()
     * @see #getIMPORTType()
     * @generated
     */
    EAttribute getIMPORTType_MODULE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.IMPORTType#getNAME()
     * @see #getIMPORTType()
     * @generated
     */
    EAttribute getIMPORTType_NAME();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#isREQUIRED <em>REQUIRED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REQUIRED</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.IMPORTType#isREQUIRED()
     * @see #getIMPORTType()
     * @generated
     */
    EAttribute getIMPORTType_REQUIRED();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType <em>ITEMS Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ITEMS Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMSType
     * @generated
     */
    EClass getITEMSType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#getITEM <em>ITEM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ITEM</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMSType#getITEM()
     * @see #getITEMSType()
     * @generated
     */
    EReference getITEMSType_ITEM();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONSCHEMA <em>BASEDONSCHEMA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>BASEDONSCHEMA</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONSCHEMA()
     * @see #getITEMSType()
     * @generated
     */
    EAttribute getITEMSType_BASEDONSCHEMA();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#getDEFAULT <em>DEFAULT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DEFAULT</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMSType#getDEFAULT()
     * @see #getITEMSType()
     * @generated
     */
    EAttribute getITEMSType_DEFAULT();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.ITEMType <em>ITEM Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ITEM Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMType
     * @generated
     */
    EClass getITEMType();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getITEMS <em>ITEMS</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>ITEMS</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMType#getITEMS()
     * @see #getITEMType()
     * @generated
     */
	EReference getITEMType_ITEMS();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getFIELD <em>FIELD</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FIELD</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMType#getFIELD()
     * @see #getITEMType()
     * @generated
     */
	EAttribute getITEMType_FIELD();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMType#getNAME()
     * @see #getITEMType()
     * @generated
     */
    EAttribute getITEMType_NAME();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getNOTSHOWIF <em>NOTSHOWIF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NOTSHOWIF</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMType#getNOTSHOWIF()
     * @see #getITEMType()
     * @generated
     */
    EAttribute getITEMType_NOTSHOWIF();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getREPOSITORYITEM <em>REPOSITORYITEM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REPOSITORYITEM</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMType#getREPOSITORYITEM()
     * @see #getITEMType()
     * @generated
     */
    EAttribute getITEMType_REPOSITORYITEM();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getSHOWIF <em>SHOWIF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SHOWIF</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMType#getSHOWIF()
     * @see #getITEMType()
     * @generated
     */
    EAttribute getITEMType_SHOWIF();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getVALUE <em>VALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUE</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMType#getVALUE()
     * @see #getITEMType()
     * @generated
     */
    EAttribute getITEMType_VALUE();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.LINKTOType <em>LINKTO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LINKTO Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.LINKTOType
     * @generated
     */
    EClass getLINKTOType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.LINKTOType#getCTYPE <em>CTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CTYPE</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.LINKTOType#getCTYPE()
     * @see #getLINKTOType()
     * @generated
     */
    EAttribute getLINKTOType_CTYPE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.LINKTOType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.LINKTOType#getNAME()
     * @see #getLINKTOType()
     * @generated
     */
    EAttribute getLINKTOType_NAME();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERSType <em>PARAMETERS Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>PARAMETERS Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERSType
     * @generated
     */
    EClass getPARAMETERSType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERSType#getPARAMETER <em>PARAMETER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>PARAMETER</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERSType#getPARAMETER()
     * @see #getPARAMETERSType()
     * @generated
     */
    EReference getPARAMETERSType_PARAMETER();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType <em>PARAMETER Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>PARAMETER Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType
     * @generated
     */
    EClass getPARAMETERType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType#getDEFAULT <em>DEFAULT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>DEFAULT</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType#getDEFAULT()
     * @see #getPARAMETERType()
     * @generated
     */
    EReference getPARAMETERType_DEFAULT();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType#getITEMS <em>ITEMS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>ITEMS</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType#getITEMS()
     * @see #getPARAMETERType()
     * @generated
     */
    EReference getPARAMETERType_ITEMS();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType#getFIELD <em>FIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FIELD</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType#getFIELD()
     * @see #getPARAMETERType()
     * @generated
     */
    EAttribute getPARAMETERType_FIELD();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType#getNAME()
     * @see #getPARAMETERType()
     * @generated
     */
    EAttribute getPARAMETERType_NAME();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType#getNBLINES <em>NBLINES</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NBLINES</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType#getNBLINES()
     * @see #getPARAMETERType()
     * @generated
     */
    EAttribute getPARAMETERType_NBLINES();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType#getNOTSHOWIF <em>NOTSHOWIF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NOTSHOWIF</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType#getNOTSHOWIF()
     * @see #getPARAMETERType()
     * @generated
     */
    EAttribute getPARAMETERType_NOTSHOWIF();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType#getNUMROW <em>NUMROW</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NUMROW</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType#getNUMROW()
     * @see #getPARAMETERType()
     * @generated
     */
    EAttribute getPARAMETERType_NUMROW();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType#isREADONLY <em>READONLY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>READONLY</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType#isREADONLY()
     * @see #getPARAMETERType()
     * @generated
     */
    EAttribute getPARAMETERType_READONLY();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType#getREPOSITORYVALUE <em>REPOSITORYVALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REPOSITORYVALUE</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType#getREPOSITORYVALUE()
     * @see #getPARAMETERType()
     * @generated
     */
    EAttribute getPARAMETERType_REPOSITORYVALUE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType#isREQUIRED <em>REQUIRED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REQUIRED</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType#isREQUIRED()
     * @see #getPARAMETERType()
     * @generated
     */
    EAttribute getPARAMETERType_REQUIRED();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType#isSHOW <em>SHOW</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SHOW</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType#isSHOW()
     * @see #getPARAMETERType()
     * @generated
     */
    EAttribute getPARAMETERType_SHOW();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType#getSHOWIF <em>SHOWIF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SHOWIF</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType#getSHOWIF()
     * @see #getPARAMETERType()
     * @generated
     */
    EAttribute getPARAMETERType_SHOWIF();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.RETURNSType <em>RETURNS Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>RETURNS Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.RETURNSType
     * @generated
     */
    EClass getRETURNSType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.component.RETURNSType#getRETURN <em>RETURN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>RETURN</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.RETURNSType#getRETURN()
     * @see #getRETURNSType()
     * @generated
     */
    EReference getRETURNSType_RETURN();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.RETURNType <em>RETURN Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>RETURN Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.RETURNType
     * @generated
     */
    EClass getRETURNType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.RETURNType#getAVAILABILITY <em>AVAILABILITY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>AVAILABILITY</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.RETURNType#getAVAILABILITY()
     * @see #getRETURNType()
     * @generated
     */
    EAttribute getRETURNType_AVAILABILITY();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.RETURNType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.RETURNType#getNAME()
     * @see #getRETURNType()
     * @generated
     */
    EAttribute getRETURNType_NAME();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.RETURNType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.RETURNType#getTYPE()
     * @see #getRETURNType()
     * @generated
     */
    EAttribute getRETURNType_TYPE();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATEPARAMType <em>TEMPLATEPARAM Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TEMPLATEPARAM Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATEPARAMType
     * @generated
     */
    EClass getTEMPLATEPARAMType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATEPARAMType#getSOURCE <em>SOURCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SOURCE</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATEPARAMType#getSOURCE()
     * @see #getTEMPLATEPARAMType()
     * @generated
     */
    EAttribute getTEMPLATEPARAMType_SOURCE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATEPARAMType#getTARGET <em>TARGET</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TARGET</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATEPARAMType#getTARGET()
     * @see #getTEMPLATEPARAMType()
     * @generated
     */
    EAttribute getTEMPLATEPARAMType_TARGET();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType <em>TEMPLATES Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TEMPLATES Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATESType
     * @generated
     */
    EClass getTEMPLATESType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getTEMPLATE <em>TEMPLATE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TEMPLATE</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getTEMPLATE()
     * @see #getTEMPLATESType()
     * @generated
     */
    EReference getTEMPLATESType_TEMPLATE();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getTEMPLATEPARAM <em>TEMPLATEPARAM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TEMPLATEPARAM</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getTEMPLATEPARAM()
     * @see #getTEMPLATESType()
     * @generated
     */
    EReference getTEMPLATESType_TEMPLATEPARAM();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getINPUT <em>INPUT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>INPUT</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getINPUT()
     * @see #getTEMPLATESType()
     * @generated
     */
    EAttribute getTEMPLATESType_INPUT();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getOUTPUT <em>OUTPUT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OUTPUT</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getOUTPUT()
     * @see #getTEMPLATESType()
     * @generated
     */
    EAttribute getTEMPLATESType_OUTPUT();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATEType <em>TEMPLATE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TEMPLATE Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATEType
     * @generated
     */
    EClass getTEMPLATEType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATEType#getLINKTO <em>LINKTO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>LINKTO</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATEType#getLINKTO()
     * @see #getTEMPLATEType()
     * @generated
     */
    EReference getTEMPLATEType_LINKTO();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATEType#getCOMPONENT <em>COMPONENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>COMPONENT</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATEType#getCOMPONENT()
     * @see #getTEMPLATEType()
     * @generated
     */
    EAttribute getTEMPLATEType_COMPONENT();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATEType#isMULTIPLEMETHODS <em>MULTIPLEMETHODS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MULTIPLEMETHODS</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATEType#isMULTIPLEMETHODS()
     * @see #getTEMPLATEType()
     * @generated
     */
    EAttribute getTEMPLATEType_MULTIPLEMETHODS();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATEType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATEType#getNAME()
     * @see #getTEMPLATEType()
     * @generated
     */
    EAttribute getTEMPLATEType_NAME();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ComponentFactory getComponentFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals  {
        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.CODEGENERATIONTypeImpl <em>CODEGENERATION Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.CODEGENERATIONTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getCODEGENERATIONType()
         * @generated
         */
        EClass CODEGENERATION_TYPE = eINSTANCE.getCODEGENERATIONType();

        /**
         * The meta object literal for the '<em><b>TEMPLATES</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CODEGENERATION_TYPE__TEMPLATES = eINSTANCE.getCODEGENERATIONType_TEMPLATES();

        /**
         * The meta object literal for the '<em><b>IMPORTS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CODEGENERATION_TYPE__IMPORTS = eINSTANCE.getCODEGENERATIONType_IMPORTS();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl <em>COMPONENT Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getCOMPONENTType()
         * @generated
         */
        EClass COMPONENT_TYPE = eINSTANCE.getCOMPONENTType();

        /**
         * The meta object literal for the '<em><b>HEADER</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT_TYPE__HEADER = eINSTANCE.getCOMPONENTType_HEADER();

        /**
         * The meta object literal for the '<em><b>DOCUMENTATION</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT_TYPE__DOCUMENTATION = eINSTANCE.getCOMPONENTType_DOCUMENTATION();

        /**
         * The meta object literal for the '<em><b>CONNECTORS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT_TYPE__CONNECTORS = eINSTANCE.getCOMPONENTType_CONNECTORS();

        /**
         * The meta object literal for the '<em><b>PARAMETERS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT_TYPE__PARAMETERS = eINSTANCE.getCOMPONENTType_PARAMETERS();

        /**
         * The meta object literal for the '<em><b>CODEGENERATION</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT_TYPE__CODEGENERATION = eINSTANCE.getCOMPONENTType_CODEGENERATION();

        /**
         * The meta object literal for the '<em><b>RETURNS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT_TYPE__RETURNS = eINSTANCE.getCOMPONENTType_RETURNS();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.CONNECTORSTypeImpl <em>CONNECTORS Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.CONNECTORSTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getCONNECTORSType()
         * @generated
         */
        EClass CONNECTORS_TYPE = eINSTANCE.getCONNECTORSType();

        /**
         * The meta object literal for the '<em><b>CONNECTOR</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTORS_TYPE__CONNECTOR = eINSTANCE.getCONNECTORSType_CONNECTOR();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.CONNECTORTypeImpl <em>CONNECTOR Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.CONNECTORTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getCONNECTORType()
         * @generated
         */
        EClass CONNECTOR_TYPE = eINSTANCE.getCONNECTORType();

        /**
         * The meta object literal for the '<em><b>BUILTIN</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_TYPE__BUILTIN = eINSTANCE.getCONNECTORType_BUILTIN();

        /**
         * The meta object literal for the '<em><b>CTYPE</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_TYPE__CTYPE = eINSTANCE.getCONNECTORType_CTYPE();

        /**
         * The meta object literal for the '<em><b>MAXINPUT</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_TYPE__MAXINPUT = eINSTANCE.getCONNECTORType_MAXINPUT();

        /**
         * The meta object literal for the '<em><b>MAXOUTPUT</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_TYPE__MAXOUTPUT = eINSTANCE.getCONNECTORType_MAXOUTPUT();

        /**
         * The meta object literal for the '<em><b>MININPUT</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_TYPE__MININPUT = eINSTANCE.getCONNECTORType_MININPUT();

        /**
         * The meta object literal for the '<em><b>MINOUTPUT</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_TYPE__MINOUTPUT = eINSTANCE.getCONNECTORType_MINOUTPUT();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.DEFAULTTypeImpl <em>DEFAULT Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.DEFAULTTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getDEFAULTType()
         * @generated
         */
        EClass DEFAULT_TYPE = eINSTANCE.getDEFAULTType();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFAULT_TYPE__VALUE = eINSTANCE.getDEFAULTType_Value();

        /**
         * The meta object literal for the '<em><b>IF</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFAULT_TYPE__IF = eINSTANCE.getDEFAULTType_IF();

        /**
         * The meta object literal for the '<em><b>NOTIF</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFAULT_TYPE__NOTIF = eINSTANCE.getDEFAULTType_NOTIF();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.DOCUMENTATIONTypeImpl <em>DOCUMENTATION Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.DOCUMENTATIONTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getDOCUMENTATIONType()
         * @generated
         */
        EClass DOCUMENTATION_TYPE = eINSTANCE.getDOCUMENTATIONType();

        /**
         * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION_TYPE__URL = eINSTANCE.getDOCUMENTATIONType_URL();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>CODEGENERATION</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CODEGENERATION = eINSTANCE.getDocumentRoot_CODEGENERATION();

        /**
         * The meta object literal for the '<em><b>COMPONENT</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__COMPONENT = eINSTANCE.getDocumentRoot_COMPONENT();

        /**
         * The meta object literal for the '<em><b>CONNECTORS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CONNECTORS = eINSTANCE.getDocumentRoot_CONNECTORS();

        /**
         * The meta object literal for the '<em><b>DOCUMENTATION</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DOCUMENTATION = eINSTANCE.getDocumentRoot_DOCUMENTATION();

        /**
         * The meta object literal for the '<em><b>HEADER</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__HEADER = eINSTANCE.getDocumentRoot_HEADER();

        /**
         * The meta object literal for the '<em><b>ITEMS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__ITEMS = eINSTANCE.getDocumentRoot_ITEMS();

        /**
         * The meta object literal for the '<em><b>PARAMETERS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PARAMETERS = eINSTANCE.getDocumentRoot_PARAMETERS();

        /**
         * The meta object literal for the '<em><b>RETURNS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__RETURNS = eINSTANCE.getDocumentRoot_RETURNS();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.HEADERTypeImpl <em>HEADER Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.HEADERTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getHEADERType()
         * @generated
         */
        EClass HEADER_TYPE = eINSTANCE.getHEADERType();

        /**
         * The meta object literal for the '<em><b>SIGNATURE</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__SIGNATURE = eINSTANCE.getHEADERType_SIGNATURE();

        /**
         * The meta object literal for the '<em><b>AUTHOR</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__AUTHOR = eINSTANCE.getHEADERType_AUTHOR();

        /**
         * The meta object literal for the '<em><b>COMPATIBILITY</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__COMPATIBILITY = eINSTANCE.getHEADERType_COMPATIBILITY();

        /**
         * The meta object literal for the '<em><b>DATAAUTOPROPAGATE</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__DATAAUTOPROPAGATE = eINSTANCE.getHEADERType_DATAAUTOPROPAGATE();

        /**
         * The meta object literal for the '<em><b>DISPLAY</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__DISPLAY = eINSTANCE.getHEADERType_DISPLAY();

        /**
         * The meta object literal for the '<em><b>EXTENSION</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__EXTENSION = eINSTANCE.getHEADERType_EXTENSION();

        /**
         * The meta object literal for the '<em><b>ICON32</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__ICON32 = eINSTANCE.getHEADERType_ICON32();

        /**
         * The meta object literal for the '<em><b>PLATEFORM</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__PLATEFORM = eINSTANCE.getHEADERType_PLATEFORM();

        /**
         * The meta object literal for the '<em><b>RELEASEDATE</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__RELEASEDATE = eINSTANCE.getHEADERType_RELEASEDATE();

        /**
         * The meta object literal for the '<em><b>SCHEMAAUTOPROPAGATE</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__SCHEMAAUTOPROPAGATE = eINSTANCE.getHEADERType_SCHEMAAUTOPROPAGATE();

        /**
         * The meta object literal for the '<em><b>SERIAL</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__SERIAL = eINSTANCE.getHEADERType_SERIAL();

        /**
         * The meta object literal for the '<em><b>STARTABLE</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__STARTABLE = eINSTANCE.getHEADERType_STARTABLE();

        /**
         * The meta object literal for the '<em><b>STATUS</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__STATUS = eINSTANCE.getHEADERType_STATUS();

        /**
         * The meta object literal for the '<em><b>VERSION</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__VERSION = eINSTANCE.getHEADERType_VERSION();

        /**
         * The meta object literal for the '<em><b>ICON24</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__ICON24 = eINSTANCE.getHEADERType_ICON24();

        /**
         * The meta object literal for the '<em><b>ICON16</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEADER_TYPE__ICON16 = eINSTANCE.getHEADERType_ICON16();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTSTypeImpl <em>IMPORTS Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.IMPORTSTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getIMPORTSType()
         * @generated
         */
        EClass IMPORTS_TYPE = eINSTANCE.getIMPORTSType();

        /**
         * The meta object literal for the '<em><b>IMPORT</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPORTS_TYPE__IMPORT = eINSTANCE.getIMPORTSType_IMPORT();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl <em>IMPORT Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getIMPORTType()
         * @generated
         */
        EClass IMPORT_TYPE = eINSTANCE.getIMPORTType();

        /**
         * The meta object literal for the '<em><b>MODULE</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT_TYPE__MODULE = eINSTANCE.getIMPORTType_MODULE();

        /**
         * The meta object literal for the '<em><b>NAME</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT_TYPE__NAME = eINSTANCE.getIMPORTType_NAME();

        /**
         * The meta object literal for the '<em><b>REQUIRED</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT_TYPE__REQUIRED = eINSTANCE.getIMPORTType_REQUIRED();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMSTypeImpl <em>ITEMS Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.ITEMSTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getITEMSType()
         * @generated
         */
        EClass ITEMS_TYPE = eINSTANCE.getITEMSType();

        /**
         * The meta object literal for the '<em><b>ITEM</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEMS_TYPE__ITEM = eINSTANCE.getITEMSType_ITEM();

        /**
         * The meta object literal for the '<em><b>BASEDONSCHEMA</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEMS_TYPE__BASEDONSCHEMA = eINSTANCE.getITEMSType_BASEDONSCHEMA();

        /**
         * The meta object literal for the '<em><b>DEFAULT</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEMS_TYPE__DEFAULT = eINSTANCE.getITEMSType_DEFAULT();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl <em>ITEM Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getITEMType()
         * @generated
         */
        EClass ITEM_TYPE = eINSTANCE.getITEMType();

        /**
         * The meta object literal for the '<em><b>ITEMS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ITEM_TYPE__ITEMS = eINSTANCE.getITEMType_ITEMS();

        /**
         * The meta object literal for the '<em><b>FIELD</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ITEM_TYPE__FIELD = eINSTANCE.getITEMType_FIELD();

        /**
         * The meta object literal for the '<em><b>NAME</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM_TYPE__NAME = eINSTANCE.getITEMType_NAME();

        /**
         * The meta object literal for the '<em><b>NOTSHOWIF</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM_TYPE__NOTSHOWIF = eINSTANCE.getITEMType_NOTSHOWIF();

        /**
         * The meta object literal for the '<em><b>REPOSITORYITEM</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM_TYPE__REPOSITORYITEM = eINSTANCE.getITEMType_REPOSITORYITEM();

        /**
         * The meta object literal for the '<em><b>SHOWIF</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM_TYPE__SHOWIF = eINSTANCE.getITEMType_SHOWIF();

        /**
         * The meta object literal for the '<em><b>VALUE</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM_TYPE__VALUE = eINSTANCE.getITEMType_VALUE();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.LINKTOTypeImpl <em>LINKTO Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.LINKTOTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getLINKTOType()
         * @generated
         */
        EClass LINKTO_TYPE = eINSTANCE.getLINKTOType();

        /**
         * The meta object literal for the '<em><b>CTYPE</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINKTO_TYPE__CTYPE = eINSTANCE.getLINKTOType_CTYPE();

        /**
         * The meta object literal for the '<em><b>NAME</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINKTO_TYPE__NAME = eINSTANCE.getLINKTOType_NAME();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERSTypeImpl <em>PARAMETERS Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.PARAMETERSTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getPARAMETERSType()
         * @generated
         */
        EClass PARAMETERS_TYPE = eINSTANCE.getPARAMETERSType();

        /**
         * The meta object literal for the '<em><b>PARAMETER</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETERS_TYPE__PARAMETER = eINSTANCE.getPARAMETERSType_PARAMETER();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl <em>PARAMETER Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getPARAMETERType()
         * @generated
         */
        EClass PARAMETER_TYPE = eINSTANCE.getPARAMETERType();

        /**
         * The meta object literal for the '<em><b>DEFAULT</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_TYPE__DEFAULT = eINSTANCE.getPARAMETERType_DEFAULT();

        /**
         * The meta object literal for the '<em><b>ITEMS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_TYPE__ITEMS = eINSTANCE.getPARAMETERType_ITEMS();

        /**
         * The meta object literal for the '<em><b>FIELD</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__FIELD = eINSTANCE.getPARAMETERType_FIELD();

        /**
         * The meta object literal for the '<em><b>NAME</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__NAME = eINSTANCE.getPARAMETERType_NAME();

        /**
         * The meta object literal for the '<em><b>NBLINES</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__NBLINES = eINSTANCE.getPARAMETERType_NBLINES();

        /**
         * The meta object literal for the '<em><b>NOTSHOWIF</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__NOTSHOWIF = eINSTANCE.getPARAMETERType_NOTSHOWIF();

        /**
         * The meta object literal for the '<em><b>NUMROW</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__NUMROW = eINSTANCE.getPARAMETERType_NUMROW();

        /**
         * The meta object literal for the '<em><b>READONLY</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__READONLY = eINSTANCE.getPARAMETERType_READONLY();

        /**
         * The meta object literal for the '<em><b>REPOSITORYVALUE</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__REPOSITORYVALUE = eINSTANCE.getPARAMETERType_REPOSITORYVALUE();

        /**
         * The meta object literal for the '<em><b>REQUIRED</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__REQUIRED = eINSTANCE.getPARAMETERType_REQUIRED();

        /**
         * The meta object literal for the '<em><b>SHOW</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__SHOW = eINSTANCE.getPARAMETERType_SHOW();

        /**
         * The meta object literal for the '<em><b>SHOWIF</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__SHOWIF = eINSTANCE.getPARAMETERType_SHOWIF();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.RETURNSTypeImpl <em>RETURNS Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.RETURNSTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getRETURNSType()
         * @generated
         */
        EClass RETURNS_TYPE = eINSTANCE.getRETURNSType();

        /**
         * The meta object literal for the '<em><b>RETURN</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RETURNS_TYPE__RETURN = eINSTANCE.getRETURNSType_RETURN();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.RETURNTypeImpl <em>RETURN Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.RETURNTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getRETURNType()
         * @generated
         */
        EClass RETURN_TYPE = eINSTANCE.getRETURNType();

        /**
         * The meta object literal for the '<em><b>AVAILABILITY</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RETURN_TYPE__AVAILABILITY = eINSTANCE.getRETURNType_AVAILABILITY();

        /**
         * The meta object literal for the '<em><b>NAME</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RETURN_TYPE__NAME = eINSTANCE.getRETURNType_NAME();

        /**
         * The meta object literal for the '<em><b>TYPE</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RETURN_TYPE__TYPE = eINSTANCE.getRETURNType_TYPE();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATEPARAMTypeImpl <em>TEMPLATEPARAM Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.TEMPLATEPARAMTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getTEMPLATEPARAMType()
         * @generated
         */
        EClass TEMPLATEPARAM_TYPE = eINSTANCE.getTEMPLATEPARAMType();

        /**
         * The meta object literal for the '<em><b>SOURCE</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATEPARAM_TYPE__SOURCE = eINSTANCE.getTEMPLATEPARAMType_SOURCE();

        /**
         * The meta object literal for the '<em><b>TARGET</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATEPARAM_TYPE__TARGET = eINSTANCE.getTEMPLATEPARAMType_TARGET();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATESTypeImpl <em>TEMPLATES Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.TEMPLATESTypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getTEMPLATESType()
         * @generated
         */
        EClass TEMPLATES_TYPE = eINSTANCE.getTEMPLATESType();

        /**
         * The meta object literal for the '<em><b>TEMPLATE</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEMPLATES_TYPE__TEMPLATE = eINSTANCE.getTEMPLATESType_TEMPLATE();

        /**
         * The meta object literal for the '<em><b>TEMPLATEPARAM</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEMPLATES_TYPE__TEMPLATEPARAM = eINSTANCE.getTEMPLATESType_TEMPLATEPARAM();

        /**
         * The meta object literal for the '<em><b>INPUT</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATES_TYPE__INPUT = eINSTANCE.getTEMPLATESType_INPUT();

        /**
         * The meta object literal for the '<em><b>OUTPUT</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATES_TYPE__OUTPUT = eINSTANCE.getTEMPLATESType_OUTPUT();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATETypeImpl <em>TEMPLATE Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.component.impl.TEMPLATETypeImpl
         * @see org.talend.designer.core.model.utils.emf.component.impl.ComponentPackageImpl#getTEMPLATEType()
         * @generated
         */
        EClass TEMPLATE_TYPE = eINSTANCE.getTEMPLATEType();

        /**
         * The meta object literal for the '<em><b>LINKTO</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEMPLATE_TYPE__LINKTO = eINSTANCE.getTEMPLATEType_LINKTO();

        /**
         * The meta object literal for the '<em><b>COMPONENT</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATE_TYPE__COMPONENT = eINSTANCE.getTEMPLATEType_COMPONENT();

        /**
         * The meta object literal for the '<em><b>MULTIPLEMETHODS</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATE_TYPE__MULTIPLEMETHODS = eINSTANCE.getTEMPLATEType_MULTIPLEMETHODS();

        /**
         * The meta object literal for the '<em><b>NAME</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATE_TYPE__NAME = eINSTANCE.getTEMPLATEType_NAME();

    }

} //ComponentPackage
