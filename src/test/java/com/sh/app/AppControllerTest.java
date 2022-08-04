package com.sh.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AppControllerTest {

    @InjectMocks
    private AppController appController;
    
    
    @Test
    @DisplayName("인덱스요청 테스트")
    public void testIndex(){
        // given
        String expected = "Helloworld";
        // when
        String text = appController.index();
        // then
        assertEquals(expected, text);
    }
}