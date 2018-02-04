package org.freifeld.reservoir.cqrswriter.controller.configuration;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author royif
 * @since 04/02/18.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER })
public @interface ConfigVariable
{
	@Nonbinding String value() default "--UNDEFINED--";
}
