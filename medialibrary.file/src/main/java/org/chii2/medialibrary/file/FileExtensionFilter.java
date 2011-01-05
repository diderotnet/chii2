package org.chii2.medialibrary.file;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

/**
 *  FileExtensionFilter is used to filer the file name with FileScanner
 */
public class FileExtensionFilter implements FileFilter {

    // Acceptable File Extensions
    private List<String> acceptableExtensions;
    // Logger
    private Logger logger;

    public FileExtensionFilter(List<String> acceptableExtensions) {
        this.acceptableExtensions = acceptableExtensions;
        logger = LoggerFactory.getLogger("org.chii2.medialibrary.file");
    }

    @Override
    public boolean accept(File file) {
        // If is directory, accept to go into
        if (file.isDirectory()) {
            return true;
        }
        // Empty file
        if (file.getName().isEmpty()) {
            logger.debug("File is rejected with empty name.");
            return false;
        }
        // Test file extension
        for (String ext : acceptableExtensions) {
            if (ext != null && !ext.isEmpty() && file.getName().endsWith(ext)) {
                logger.debug("File <{}> is accepted.", file.getName());
                return true;
            }
        }
        // Should not reach, in case just reject
        logger.debug("File <{}> is rejected.", file.getName());
        return false;
    }

}