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

package de.defmacro.dandelion.internal.ui.text.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class KeywordSymbolRule 
extends PrefixedWordRule
{
	public KeywordSymbolRule(IToken token, IPrefixedWordEndDetector detector)
	{
		super(":", token, detector);
	}

	@Override
	public IToken evaluate(ICharacterScanner scanner) {
		scanner.unread();
		int ch = scanner.read();
		//ch < 0, wenn allerstes wort in datei ein keywort symbol
		if(ch < 0 || Character.isWhitespace(ch) || ch == '\'' || ch == '(') {
			return super.evaluate(scanner);
		}
		
		return Token.UNDEFINED;
	}
}
