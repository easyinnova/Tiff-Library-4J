/**
 * <h1>Ascii.java</h1>
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
 * along with this program. If not, see <a
 * href="http://www.gnu.org/licenses/">http://www.gnu.org/licenses/</a> and at <a
 * href="http://mozilla.org/MPL/2.0">http://mozilla.org/MPL/2.0</a> .
 * </p>
 * <p>
 * NB: for the © statement, include Easy Innova SL or other company/Person contributing the code.
 * </p>
 * <p>
 * © 2015 Easy Innova, SL
 * </p>
 *
 * @author Xavier Tarrés Bonet
 * @version 1.0
 * @since 26/5/2015
 *
 */
package com.easyinnova.tiff.model.types;

/**
 * The Class Ascii.
 */
public class Ascii extends abstractTiffType {
  
  /** The value. */
  private byte value;
  
  /**
   * Instantiates a new ascii.
   *
   * @param ch the value
   */
  public Ascii(int ch) {
    super();
    this.value = (byte) ch;
    setTypeSize(1);
  }

  /**
   * Gets the value.
   *
   * @return the value
   */
  public int getValue() {
    return (int) value;
  }

  /**
   * Sets the value.
   *
   * @param value the value to set
   */
  public void setValue(byte value) {
    this.value = value;
  }

  @Override
  public String toString() {
    String s = "";
    if (value > 0)
      s += (char) value;
    return s;
  }

  /**
   * To byte.
   *
   * @return the byte
   */
  @Override
  public byte toByte() {
    byte b = value;
    return b;
  }
}
