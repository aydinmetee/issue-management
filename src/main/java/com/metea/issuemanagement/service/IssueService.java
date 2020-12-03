package com.metea.issuemanagement.service;

import com.metea.issuemanagement.dto.IssueDto;
import com.metea.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

public interface IssueService {
    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);
}
