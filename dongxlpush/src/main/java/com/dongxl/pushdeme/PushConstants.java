/**
 * Wire
 * Copyright (C) 2019 Wire Swiss GmbH
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.dongxl.pushdeme;

public class PushConstants {

    //2882303761517172047
    public static final String XIAOMI_APP_ID = BuildConfig.XIAOMIPUSH_APPID;
    //5331717244047
    public static final String XIAOMI_APP_KEY = BuildConfig.XIAOMIPUSH_APPKEY;
    //此TAG在adb logcat中检索自己所需要的信息， 只需在命令行终端输入 adb logcat | grep
    public static final String XIAOMI_TAG = BuildConfig.APPLICATION_ID;

    public static final String ACTION_PUSHRECEIVESERVICE = "com.dongxl.pushdeme.action.startPushReceiveService";

    //oppp
    public static final String OPPO_APP_ID = BuildConfig.OPPOPUSH_APPID;
    public static final String OPPO_APP_KEY = BuildConfig.OPPOPUSH_APPKEY;
    public static final String OPPO_APP_SECRET = BuildConfig.OPPOPUSH_APPSECRET;

    //meizu
    public static final String MEIZU_APP_ID = BuildConfig.MEIZUPUSH_APPID;
    public static final String MEIZU_APP_KEY = BuildConfig.MEIZUPUSH_APPKEY;

    public static final String KEY_PUSH_DATA = "push_data";

    public static class PushPlatform {
        public static final String PLATFORM_XIAOMI = "xiaomi";
        public static final String PLATFORM_HUAWEI = "huawei";
        public static final String PLATFORM_VIVO = "vivo";
        public static final String PLATFORM_OPPO = "oppo";
        public static final String PLATFORM_FLYME = "flyme";
        public static final String PLATFORM_OTHER = "other";
    }

    public static class HandlerWhat {
        public static final int WHAT_THROUGH_MESSAGE = 0x010;
        public static final int WHAT_NOTIFI_MESSAGE_CLICK = 0x011;
        public static final int WHAT_NOTIFI_MESSAGE_ARRIVE = 0x012;
        public static final int WHAT_PUSH_REGISTER = 0x013;
        public static final int WHAT_PUSH_UNALIAS = 0x014;
        public static final int WHAT_PUSH_ALIAS = 0x015;
        public static final int WHAT_PUSH_UNTOPIC = 0x016;
        public static final int WHAT_PUSH_TOPIC = 0x017;
        public static final int WHAT_PUSH_UNACCOUNT = 0x018;
        public static final int WHAT_PUSH_ACCOUNT = 0x019;
        public static final int WHAT_PUSH_ACCEPT_TIME = 0x020;
        public static final int WHAT_PUSH_OTHER = 0x021;

    }
}
