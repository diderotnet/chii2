package org.chii2.mediaserver.api.content.item;

import org.chii2.mediaserver.api.upnp.Filter;
import org.teleal.cling.support.model.item.ImageItem;

/**
 * Visual Picture Item
 */
public abstract class VisualPictureItem extends ImageItem {
    // Filter
    protected Filter filter;

    public String getAlbum() {
        return getFirstPropertyValue(Property.UPNP.ALBUM.class);
    }

    public VisualPictureItem setAlbum(String album) {
        replaceFirstProperty(new Property.UPNP.ALBUM(album));
        return this;
    }
}
