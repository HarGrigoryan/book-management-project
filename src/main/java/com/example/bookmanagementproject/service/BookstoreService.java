package com.example.bookmanagementproject.service;

import com.example.bookmanagementproject.persistance.repository.BookRepository;
import com.opencsv.CSVReader;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

@Service
public class BookstoreService {
    private final BookRepository bookRepository;

    @Autowired
    public BookstoreService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @SneakyThrows
    public boolean uploadBooks(MultipartFile file) {
        /*Reader reader = new InputStreamReader(file.getInputStream());
        CSVReader csvReader = new CSVReader(reader);
        System.out.println("Titles: " + Arrays.toString(csvReader.readNext()));
        System.out.println("First row after titles: " + Arrays.toString(csvReader.readNext()));*/
        CSVToDBUploadHandler csvToDBUploadHandler = new CSVToDBUploadHandler();
        csvToDBUploadHandler.processCsvFile(file);
        return false;
    }
}
