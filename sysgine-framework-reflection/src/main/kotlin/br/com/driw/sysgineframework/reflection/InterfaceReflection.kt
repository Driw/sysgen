package br.com.driw.sysgineframework.reflection

import br.com.driw.sysgineframework.reflection.utils.isConcreteClass
import kotlin.reflect.KClass

/**
 * Find any implementation of that interface otherwise will throw an exception.
 *
 * @see MissingImplementationException
 */
inline fun <reified T : Any> KClass<T>.findImplementation(): KClass<out T> =
	ReflectionProvider.reflection()
		.getSubTypesOf(this.java)
		.filter { it.isConcreteClass }
		.maxByOrNull { PriorityReflection.findValueByClass(it) }
		?.kotlin
		?: throw MissingImplementationException(this)
