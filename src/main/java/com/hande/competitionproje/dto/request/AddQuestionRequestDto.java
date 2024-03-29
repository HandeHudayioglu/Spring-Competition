package com.hande.competitionproje.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddQuestionRequestDto {

    private QuestionRequestDto question;
    private List<AnswersRequestDto> answers;
}
