export interface ErrorResponse {
    timestamp?: string;
    status?:    number;
    error?:     string;
    errors?:    Error[];
    message?:   string;
    path?:      string;
}

export interface Error {
    codes?:          string[];
    arguments?:      Argument[];
    defaultMessage?: string;
    objectName?:     string;
    field?:          string;
    rejectedValue?:  string;
    bindingFailure?: boolean;
    code?:           string;
}

export interface Argument {
    codes?:          string[];
    arguments?:      null;
    defaultMessage?: string;
    code?:           string;
}
