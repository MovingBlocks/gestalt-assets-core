/*
 * Copyright 2014 MovingBlocks
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

package org.terasology.assets;

import com.google.common.base.Optional;
import org.terasology.naming.Name;
import org.terasology.naming.ResourceUrn;

import java.io.Closeable;
import java.io.IOException;
import java.util.Set;

/**
 * @author Immortius
 */
public interface AssetProducer<T extends AssetData> extends Closeable {

    Set<ResourceUrn> getAvailableAssetUrns();

    Set<ResourceUrn> resolve(String urn, Name moduleContext);

    ResourceUrn redirect(ResourceUrn urn);

    Optional<T> getAssetData(ResourceUrn urn) throws IOException;

    @Override
    void close();


}
