/*
 * PreferencesCommand.java
 *
 * Copyright (C) 2002-2015 Takis Diakoumis
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

package org.executequery.actions.toolscommands;

import java.awt.event.ActionEvent;
import org.executequery.GUIUtilities;
import org.underworldlabs.swing.actions.BaseCommand;
import org.executequery.actions.OpenFrameCommand;
import org.executequery.gui.BaseDialog;
import org.executequery.gui.prefs.PropertiesPanel;

/** <p>Executes the Tools | Preferences command.
 *
 *  @author   Takis Diakoumis
 *  @version  $Revision: 1500 $
 *  @date     $Date: 2015-09-20 21:20:04 +1000 (Sun, 20 Sep 2015) $
 */
public class PreferencesCommand extends OpenFrameCommand
                                implements BaseCommand {
    
    public void execute(ActionEvent e) {
        try {
            GUIUtilities.showWaitCursor();
            BaseDialog dialog = createDialog(PropertiesPanel.TITLE, true);
            PropertiesPanel panel = new PropertiesPanel(dialog);
            dialog.addDisplayComponentWithEmptyBorder(panel);
            dialog.display();
        }
        finally {
            GUIUtilities.showNormalCursor();
        }

    }
    
}

