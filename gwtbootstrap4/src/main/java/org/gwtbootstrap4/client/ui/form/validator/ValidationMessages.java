package org.gwtbootstrap4.client.ui.form.validator;

/*
 * #%L
 * GwtBootstrap4
 * %%
 * Copyright (C) 2015 GwtBootstrap4
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.i18n.client.ConstantsWithLookup;
import com.google.gwt.i18n.client.LocalizableResource.DefaultLocale;

/**
 * Validation messages.
 * 
 * Message functions should be the key with "_" replacing any periods. This allows the
 * ValidationMessageResolver to find the message by key.
 * 
 * @author Steven Jardine
 */
@DefaultLocale("en")
public interface ValidationMessages extends ConstantsWithLookup {

    public static class Keys {

        public static final String BLANK = "org.gwtbootstrap4.validation.Blank.message";

        public static final String DECIMAL_MAX = "org.gwtbootstrap4.validation.DecimalMax.message";

        public static final String DECIMAL_MIN = "org.gwtbootstrap4.validation.DecimalMin.message";

        public static final String FIELD_MATCH = "org.gwtbootstrap4.validation.FieldMatch.message";

        public static final String FUTURE = "org.gwtbootstrap4.validation.Future.message";

        public static final String PAST = "org.gwtbootstrap4.validation.Past.message";

        public static final String REGEX = "org.gwtbootstrap4.validation.RegEx.message";

        public static final String SIZE = "org.gwtbootstrap4.validation.Size.message";

    }

    /**
     * @return the blank validation message.
     */
    @Key(Keys.BLANK)
    @DefaultStringValue("Field cannot be blank")
    String org_gwtbootstrap4_validation_Blank_message();

    /**
     * @return the decimal max validation message.
     */
    @Key(Keys.DECIMAL_MAX)
    @DefaultStringValue("Value must be less than or equal to {1}")
    String org_gwtbootstrap4_validation_DecimalMax_message();

    /**
     * @return the decimal min validation message.
     */
    @Key(Keys.DECIMAL_MIN)
    @DefaultStringValue("Value must be greater than or equal to {1}")
    String org_gwtbootstrap4_validation_DecimalMin_message();

    /**
     * @return the field match validation message.
     */
    @Key(Keys.FIELD_MATCH)
    @DefaultStringValue("{1} do not match")
    String org_gwtbootstrap4_validation_FieldMatch_message();

    /**
     * @return the future validation message.
     */
    @Key(Keys.FUTURE)
    @DefaultStringValue("Value must be in the future")
    String org_gwtbootstrap4_validation_Future_message();

    /**
     * @return the past validation message.
     */
    @Key(Keys.PAST)
    @DefaultStringValue("Value must be in the past")
    String org_gwtbootstrap4_validation_Past_message();

    /**
     * @return the regular expression validation message.
     */
    @Key(Keys.REGEX)
    @DefaultStringValue("Must match regex")
    String org_gwtbootstrap4_validation_RegEx_message();

    /**
     * @return the size validation message.
     */
    @Key(Keys.SIZE)
    @DefaultStringValue("Size must be between {1} and {2}")
    String org_gwtbootstrap4_validation_Size_message();

}
