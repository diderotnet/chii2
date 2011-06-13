package org.chii2.mediaserver.content.common.Item;

import org.chii2.mediaserver.api.content.item.VisualPictureItem;

/**
 * Picture Item
 */
public class PictureItem extends VisualPictureItem {

    // Filter
    private String filter;

    /**
     * Constructor
     *
     * @param filter   Content Filter
     * @param id       Item ID
     * @param parentId Item Parent ID
     * @param title    Item Title
     * @param album Album
     */
    public PictureItem(String filter, String id, String parentId, String title, String album) {
        super();

        this.filter = filter;

        // Item ID
        setId(id);
        // Item Parent ID
        setParentID(parentId);
        // Item Title
        setTitle(title);
        // Photo Album
        if (filter.contains("upnp:album")) {
            setAlbum(album);
        }
        //  Creator (part of UPnP protocol standard)
        setCreator("System");
    }
}