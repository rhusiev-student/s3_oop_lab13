#!/bin/sh

text=$1

echo "Text: $text"

curl https://api.openai.com/v1/chat/completions \
  -H "Content-Type: application/json" \
  -H "Authorization: Bearer $OPENAI_API_KEY" \
  -d '{
  "model": "gpt-3.5-turbo-16k",
  "messages": [
    {
      "role": "system",
      "content": "Get the company logo'\''s (preferably png or jpg) url and description of the company from the html provided by user. Give an answer in the format:\nURL: https://url.to.jpg\nDescription: description of the company"
    },
    {
      "role": "user",
      "content": "'"$text"'"
    }
  ],
  "temperature": 1,
  "max_tokens": 400,
  "top_p": 1,
  "frequency_penalty": 0,
  "presence_penalty": 0
}'
