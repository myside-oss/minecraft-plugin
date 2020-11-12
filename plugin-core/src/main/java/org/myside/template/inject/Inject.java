package org.myside.template.inject;

import org.myside.template.api.Template;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Inject {
    public static void inject(String field, Object value) throws Exception {
        final Field declaredField = Template.class.getDeclaredField(field);

        declaredField.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(declaredField, declaredField.getModifiers() & ~Modifier.FINAL);

        declaredField.set(null, value);
    }

    public static void suppressIllegalAccess() {
        try {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            Unsafe u = (Unsafe) theUnsafe.get(null);

            Class cls = Class.forName("jdk.internal.module.IllegalAccessLogger");
            Field logger = cls.getDeclaredField("logger");
            u.putObjectVolatile(cls, u.staticFieldOffset(logger), null);
        } catch (Exception ignore) {
            // ignore
        }
    }
}
