package com.example.mybatissample.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

//ユーザー情報更新　リクエストデータ
@Data
@EqualsAndHashCode(callSuper = false)
public class UserUpdateRequest extends UserAddRequest implements Serializable {
	//ユーザーID
	@NotNull
	private Long id;
}
