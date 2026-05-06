# Review Journal

I treated `granite-trace-profile-yard` as a project where the smallest useful behavior should still be inspectable.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 199, lane `ship`
- `stress`: `latency skew`, score 209, lane `ship`
- `edge`: `signal loss`, score 222, lane `ship`
- `recovery`: `incident shape`, score 129, lane `watch`
- `stale`: `span volume`, score 161, lane `ship`

## Note

The repository should be understandable without pretending it is larger than it is.
