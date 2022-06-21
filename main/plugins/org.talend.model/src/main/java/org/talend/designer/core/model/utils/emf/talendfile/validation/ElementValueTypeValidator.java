/**
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.validation;


/**
 * A sample validator interface for {@link org.talend.designer.core.model.utils.emf.talendfile.ElementValueType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ElementValueTypeValidator {
    boolean validate();

    boolean validateElementRef(String value);
    boolean validateValue(String value);
    boolean validateType(String value);

    boolean validateHexValue(boolean value);

    boolean validateLabel(String value);
}
