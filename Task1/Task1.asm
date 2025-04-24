section .data
	newline db 10
	space db ' '

section .bss
	n resb 1

section .text
	global _start

_start:
;чтение N
	mov rax, 0
	mov rdi, 0
	mov rsi, n
	mov rdx, 1
	syscall

;преобразование ASCII в число
	movzx rcx, byte [n]
	sub rcx, '0'
	cmp rcx, 1
	jl exit
	mov [n], cl

;вычисление начального символа
	mov al, [n]
	add al, 'A' - 1
	mov [n], al

;внешний цикл
mov r8, 1
outer_loop:
;внутренний цикл (печать символов)
	mov r9, r8
	mov bl, [n]

print_chars:
;печать символа
	mov [space], bl
	mov rax, 1
	mov rdi, 1
	mov rsi, space
	mov rdx, 1
	push r9
	push r8
	syscall
	pop r8
	pop r9

;печать пробела, если это не последний символ
	dec r9
	jz print_newline

	mov rax, 1
	mov rdi, 1
	mov rsi, space+1
	mov rdx, 1
	push r9
	push r8
	syscall
	pop r8
	pop r9

	dec bl
	jmp print_chars

print_newline:
;печать новой строки
	mov rax, 1
	mov rdi, 1
	mov rsi, newline
	mov rdx, 1
	push r8
	syscall
	pop r8

;переход к следующей строке
	inc r8
	mov cl, [n]
	sub cl, 'A' - 1
	cmp r8b, cl
	jle outer_loop

exit:
	mov rax, 60
	xor rdi, rdi
	syscall
