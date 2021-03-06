/*
 Dandelion, a Lisp plugin for Eclipse.
 Copyright (C) 2007 Michael Bohn

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License along
 with this program; if not, write to the Free Software Foundation, Inc.,
 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package de.defmacro.dandelion.internal.core.dom.parse;

import javax.annotation.CheckForNull;

import de.defmacro.dandelion.internal.core.dom.IMalformationProvider;

/**
 * Schnittstelle fuer Parser-Klassen.
 * @author Michael Bohn
 *
 * @param <T>
 */
public interface IParser<T> 
extends IMalformationProvider 
{
	@CheckForNull
	public T parse(IParserInput input);
}
