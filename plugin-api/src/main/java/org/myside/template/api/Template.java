package org.myside.template.api;

import org.jetbrains.annotations.Nullable;

import static com.google.common.base.Preconditions.checkState;

/**
 * A static all access class granting static access to various systems
 * for the API.
 */
@SuppressWarnings("NullableProblems")
public final class Template {
    private static Manager templateManager;

    private static <T> T check(@Nullable T instance) {
        checkState(instance != null, "Template has not been initialized!");
        return instance;
    }

    /**
     * Gets the {@link Manager} instance.
     *
     * @return The template manager instance
     */
    public static Manager getTemplateManager() {
        return check(templateManager);
    }

}
