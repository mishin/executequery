/*
 * TableModifier.java
 *
 * Copyright (C) 2002-2009 Takis Diakoumis
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.executequery.gui.table;

/* ----------------------------------------------------------
 * CVS NOTE: Changes to the CVS repository prior to the 
 *           release of version 3.0.0beta1 has meant a 
 *           resetting of CVS revision numbers.
 * ----------------------------------------------------------
 */

/**
 * defines those objects with table functions requiring sql output
 * 
 * @author   Takis Diakoumis
 * @version  $Revision: 1460 $
 * @date     $Date: 2009-01-25 11:06:46 +1100 (Sun, 25 Jan 2009) $
 */
public interface TableModifier extends CreateTableSQLSyntax {
    
    int COLUMN_VALUES = 0;
    int CONSTRAINT_VALUES = 1;
    
    /** 
     * Generates and prints the SQL text. 
     */
    public void setSQLText();
    
    /** 
     * Generates and prints the SQL text with the
     * specified values as either column values or
     * constraints values depending on the type parameter.
     *
     * @param the values to add to the SQL
     * @param the type of values - column or constraint
     */
    public void setSQLText(String values, int type);
    
    /** 
     * Retrieves the currently selected/created table name.
     *
     * @return the table name
     */
    public String getTableName();
    
}






