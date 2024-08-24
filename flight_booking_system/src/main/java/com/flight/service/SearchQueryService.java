package com.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.model.SearchQuery;
import com.flight.repository.SearchQueryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SearchQueryService {

    @Autowired
    private SearchQueryRepository searchQueryRepository;

    public SearchQuery saveSearchQuery(SearchQuery searchQuery) {
        return searchQueryRepository.save(searchQuery);
    }

    public List<SearchQuery> getAllSearchQueries() {
        return searchQueryRepository.findAll();
    }

    public Optional<SearchQuery> getSearchQueryById(Long id) {
        return searchQueryRepository.findById(id);
    }

    public SearchQuery updateSearchQuery(Long id, SearchQuery searchQuery) {
        if (searchQueryRepository.existsById(id)) {
            searchQuery.setId(id);
            return searchQueryRepository.save(searchQuery);
        }
        return null;
    }

    public void deleteSearchQuery(Long id) {
        searchQueryRepository.deleteById(id);
    }
}
