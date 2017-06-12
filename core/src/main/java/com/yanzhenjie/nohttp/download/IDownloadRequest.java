/*
 * Copyright 2015 Yan Zhenjie
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yanzhenjie.nohttp.download;

import com.yanzhenjie.nohttp.IBasicRequest;

/**
 * <p>
 * Download task request interface.
 * </p>
 * Created by Yan Zhenjie on Oct 21, 2015.
 */
public interface IDownloadRequest extends IBasicRequest {

    /**
     * Return the mFileDir.
     *
     * @return it won't be empty.
     */
    String getFileDir();

    /**
     * Return the mFileName.
     *
     * @return it won't be empty.
     */
    String getFileName();

    /**
     * According to the Http header named files automatically.
     *
     * @return true need, false not need.
     */
    boolean autoNameByHead();

    /**
     * Return the isRange.
     *
     * @return true: breakpoint continuing, false: don't need a breakpoint continuing.
     */
    boolean isRange();

    /**
     * If there is a old files, whether to delete the old files.
     *
     * @return true: deleted, false: don't delete.
     */
    boolean isDeleteOld();

}