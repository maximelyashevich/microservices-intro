{{/* Define the current date label */}}
{{- define "current-date" -}}
{{ now | htmlDate }}
{{- end }}

{{/* Define the version label */}}
{{- define "version" -}}
{{ .Chart.Version }}
{{- end }}