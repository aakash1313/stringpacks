/* Copyright (c) Facebook, Inc. and its affiliates. All rights reserved.
 *
 * This source code is licensed under the Apache 2.0 license found in
 * the LICENSE file in the root directory of this source tree.
 */

package com.example.stringpacktest;

import com.whatsapp.stringpacks.StringPacks;

public class StringPackIds {

  public static void registerStringPackIds() {
    StringPacks.getInstance().register(getStringPacksMapping());
  }

  private static int[] getStringPacksMapping() {
    return new int[]{
            R.string.hello_second_fragment, 0,
    };
  }

  // region StringPacks ID Map
  // endregion
}
