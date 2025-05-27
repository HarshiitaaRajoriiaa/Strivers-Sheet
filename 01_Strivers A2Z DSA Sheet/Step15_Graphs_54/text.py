from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
from cryptography.hazmat.backends import default_backend
import os
def encrypt_aes(key, plaintext):
    # Generate a random 16-byte IV (Initialization Vector)
    iv = os.urandom(16)
    # Create AES cipher in CBC mode
    cipher = Cipher(algorithms.AES(key), modes.CBC(iv), backend=default_backend())
    encryptor = cipher.encryptor()
    # PKCS7 padding to make plaintext a multiple of block size (16 bytes)
    pad_len = 16 - (len(plaintext) % 16)
    padding = bytes([pad_len] * pad_len)
    padded_plaintext = plaintext + padding
    ciphertext = encryptor.update(padded_plaintext) + encryptor.finalize()
    
    return iv + ciphertext  # Prepend IV for use in decryption
def decrypt_aes(key, ciphertext):
    iv = ciphertext[:16]
    actual_ciphertext = ciphertext[16:]
    cipher = Cipher(algorithms.AES(key), modes.CBC(iv), backend=default_backend())
    decryptor = cipher.decryptor()
    padded_plaintext = decryptor.update(actual_ciphertext) + decryptor.finalize()
    # Remove PKCS7 padding
    pad_len = padded_plaintext[-1]
    plaintext = padded_plaintext[:-pad_len]
    return plaintext

