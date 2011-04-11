package org.chii2.medialibrary.api.core;

import org.chii2.medialibrary.api.persistence.entity.Image;
import org.chii2.medialibrary.api.persistence.entity.Movie;

import java.util.List;
import java.util.Map;

/**
 * Media Library Core Interface, provide major functionality & operations.
 */
public interface MediaLibraryService {

    /**
     * Scan for all kinds of media files in directories.
     * (Media type extensions and  Directories are configured in configuration file)
     */
    public void scanAll();

    /**
     * Scan for all movie files in directories.
     */
    public void scanMovies();

    /**
     * Scan for all image files in directories.
     */
    public void scanImages();

    /**
     * Get all the Movies in the Media Library.
     *
     * @return Movie List
     */
    public List<? extends Movie> getMovies();

    /**
     * Get all the Movies in the Media Library.
     *
     * @param firstResult First Result
     * @param maxResults  Max Result
     * @return Movie List
     */
    public List<? extends Movie> getMovies(int firstResult, int maxResults);

    /**
     * Get all the Movies in the Media Library.
     * The Sort Field must prefix with "file." or "info."
     * eg. "file.duration" will reference to MovieFile duration
     * "info.language" will reference to MovieInfo language
     *
     * @param firstResult First Result
     * @param maxResults  Max Result
     * @param sorts       Sort (by <field, sortType>, sort type maybe "asc" or "desc")
     * @return Movie List
     */
    public List<? extends Movie> getMovies(int firstResult, int maxResults, Map<String, String> sorts);

    /**
     * Get Movie by Movie ID
     *
     * @param id Movie ID
     * @return Movie
     */
    public Movie getMovieById(String id);

    /**
     * Get all possible movie records by movie name
     *
     * @param movieName Movie Name
     * @return Movie List
     */
    public List<? extends Movie> getMoviesByName(String movieName);

    /**
     * Get all possible movie records by movie name
     *
     * @param movieName   Movie Name
     * @param firstResult First Result
     * @param maxResults  Max Result
     * @return Movie List
     */
    public List<? extends Movie> getMoviesByName(String movieName, int firstResult, int maxResults);

    /**
     * Get all possible movie records by movie name
     * The Sort Field must prefix with "file." or "info."
     * eg. "file.duration" will reference to MovieFile duration
     * "info.language" will reference to MovieInfo language
     *
     * @param movieName   Movie Name
     * @param firstResult First Result
     * @param maxResults  Max Result
     * @param sorts       Sort (by <field, sortType>, sort type maybe "asc" or "desc")
     * @return Movie List
     */
    public List<? extends Movie> getMoviesByName(String movieName, int firstResult, int maxResults, Map<String, String> sorts);

    /**
     * Get Movie default thumbnail
     *
     * @param movieId Movie ID
     * @return Thumbnail
     */
    public byte[] getMovieThumbnailById(String movieId);

    /**
     * Get Movies Count
     *
     * @return Count
     */
    public long getMoviesCount();

    /**
     * Get Movie Files Count
     *
     * @return Count
     */
    public long getMovieFilesCount();

    /**
     * Get all the Images
     *
     * @return Image List
     */
    public List<? extends Image> getImages();

    /**
     * Get all the Images
     *
     * @param firstResult First Result
     * @param maxResults  Max Result
     * @return Image List
     */
    public List<? extends Image> getImages(int firstResult, int maxResults);

    /**
     * Get all the Images
     *
     * @param firstResult First Result
     * @param maxResults  Max Result
     * @param sorts       Sort (by <field, sortType>, sort type maybe "asc" or "desc")
     * @return Image List
     */
    public List<? extends Image> getImages(int firstResult, int maxResults, Map<String, String> sorts);

    /**
     * Get Image by Image ID
     *
     * @param id Image ID
     * @return Image
     */
    public Image getImageById(String id);

    /**
     * Get all possible image records by image name
     *
     * @param imageName Image Name
     * @return Image List
     */
    public List<? extends Image> getImagesByName(String imageName);

    /**
     * Get image records by image name
     *
     * @param firstResult First Result
     * @param maxResults  Max Result
     * @param imageName   Image Name
     * @return Image List
     */
    public List<? extends Image> getImagesByName(String imageName, int firstResult, int maxResults);

    /**
     * Get image records by image name
     *
     * @param firstResult First Result
     * @param maxResults  Max Result
     * @param sorts       Sort (by <field, sortType>, sort type maybe "asc" or "desc")
     * @param imageName   Image Name
     * @return Image List
     */
    public List<? extends Image> getImagesByName(String imageName, int firstResult, int maxResults, Map<String, String> sorts);

    /**
     * Get all image albums
     *
     * @return Image Albums
     */
    public List<String> getImageAlbums();

    /**
     * Get image albums from index with max limit
     *
     * @param firstResult First Result
     * @param maxResults  Max Result
     * @return Image Albums
     */
    public List<String> getImageAlbums(int firstResult, int maxResults);

    /**
     * Get image albums from index with max limit
     *
     * @param firstResult First Result
     * @param maxResults  Max Result
     * @param sorts       Sort (by <field, sortType>, sort type maybe "asc" or "desc")
     * @return Image Albums
     */
    public List<String> getImageAlbums(int firstResult, int maxResults, Map<String, String> sorts);

    /**
     * Get the count of total image albums
     *
     * @return Count
     */
    public long getImageAlbumsCount();

    /**
     * Get images by image album
     *
     * @param album Image Album
     * @return Images
     */
    public List<? extends Image> getImagesByAlbum(String album);

    /**
     * Get images by image album
     *
     * @param album       Image Album
     * @param firstResult First Result
     * @param maxResults  Max Result
     * @return Images
     */
    public List<? extends Image> getImagesByAlbum(String album, int firstResult, int maxResults);

    /**
     * Get images by image album
     *
     * @param album       Image Album
     * @param firstResult First Result
     * @param maxResults  Max Result
     * @param sorts       Sort (by <field, sortType>, sort type maybe "asc" or "desc")
     * @return Images
     */
    public List<? extends Image> getImagesByAlbum(String album, int firstResult, int maxResults, Map<String, String> sorts);

    /**
     * Get count of images belong to  specific album
     *
     * @param album Image Album
     * @return Count
     */
    public long getImagesCountByAlbum(String album);
}
