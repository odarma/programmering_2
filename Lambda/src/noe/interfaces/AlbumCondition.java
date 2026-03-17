package noe.interfaces;

import noe.models.Album;

public interface AlbumCondition {
    boolean isMet(Album album);
}
