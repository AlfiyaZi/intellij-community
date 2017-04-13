/*
 * Copyright 2000-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.vcs.commit;

import com.intellij.ui.JBIntSpinner;
import com.intellij.ui.components.JBCheckBox;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class BodyLimitInspectionOptions {
  private JBIntSpinner myMarginSpinner;
  private JPanel myMainPanel;
  private JBCheckBox myShowRightMargin;
  private JBCheckBox myWrapWhenTyping;

  @NotNull
  public JPanel getMainPanel() {
    return myMainPanel;
  }

  private void createUIComponents() {
    myMarginSpinner = new JBIntSpinner(0, 0, 10000);
  }
}
