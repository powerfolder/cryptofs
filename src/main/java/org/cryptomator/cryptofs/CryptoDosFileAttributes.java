/*******************************************************************************
 * Copyright (c) 2016 Sebastian Stenzel and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the accompanying LICENSE.txt.
 *
 * Contributors:
 *     Sebastian Stenzel - initial API and implementation
 *******************************************************************************/
package org.cryptomator.cryptofs;

import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributes;

import org.cryptomator.cryptolib.api.FileHeaderCryptor;

public class CryptoDosFileAttributes extends CryptoBasicFileAttributes implements DelegatingDosFileAttributes {

	private DosFileAttributes delegate;

	public CryptoDosFileAttributes(DosFileAttributes delegate, Path ciphertextPath, FileHeaderCryptor headerCryptor) {
		super(delegate, ciphertextPath, headerCryptor);
	}

	@Override
	public DosFileAttributes getDelegate() {
		return delegate;
	}

}
