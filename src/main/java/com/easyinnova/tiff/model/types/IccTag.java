/**
 * <h1>IccTag.java</h1> 
 * <p>
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version; or, at your choice, under the terms of the
 * Mozilla Public License, v. 2.0. SPDX GPL-3.0+ or MPL-2.0+.
 * </p>
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License and the Mozilla Public License for more details.
 * </p>
 * <p>
 * You should have received a copy of the GNU General Public License and the Mozilla Public License
 * along with this program. If not, see <a href="http://www.gnu.org/licenses/">http://www.gnu.org/licenses/</a> and at
 * <a href="http://mozilla.org/MPL/2.0">http://mozilla.org/MPL/2.0</a> .
 * </p>
 * <p>
 * NB: for the © statement, include Easy Innova SL or other company/Person contributing the code.
 * </p>
 * <p>
 * © 2015 Easy Innova, SL
 * </p>
 *
 * @author Víctor Muñoz Solà
 * @version 1.0
 * @since 25/5/2015
 *
 */
package com.easyinnova.tiff.model.types;

/**
 * The Class IccTag.
 */
public class IccTag {
  /** Tag signature. */
  int signature;

  /** Address of the tag data element. */
  int offset;

  /** Number of bytes in the tag data. */
  int size;

  /**
   * Instantiates a new icc tag.
   *
   * @param signature the signature
   * @param offset the offset
   * @param size the size
   */
  public IccTag(int signature, int offset, int size) {
    this.signature = signature;
    this.offset = offset;
    this.size = size;
  }
}

