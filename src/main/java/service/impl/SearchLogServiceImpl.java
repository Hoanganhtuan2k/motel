package service.impl;

import dto.SearchLogDto;
import entity.SearchLog;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import repo.SearchLogRepository;
import service.SearchLogService;

@Service
@RequiredArgsConstructor
public class SearchLogServiceImpl implements SearchLogService {
    private final SearchLogRepository searchLogRepository;
    private final ModelMapper modelMapper;

    public SearchLogDto create(SearchLogDto searchLogDto) {
        SearchLog searchLog = modelMapper.map(searchLogDto, SearchLog.class);
        return modelMapper.map(searchLogRepository.save(searchLog), SearchLogDto.class);
    }

    public SearchLogDto findById(Long id) {
        return modelMapper.map(searchLogRepository.findById(id).orElse(new SearchLog()), SearchLogDto.class);
    }

    public SearchLogDto findByLatitudeAndLongitude(Double latitude, Double longitude) {
        return modelMapper.map(searchLogRepository.findByLatitudeAndLongitude(latitude,longitude)
                .orElse(new SearchLog()), SearchLogDto.class);
    }


}
