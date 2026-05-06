# granite-trace-profile-yard

`granite-trace-profile-yard` is a Scala project in observability. Its focus is to package a Scala local lab for profile analysis with fixture event logs, golden state snapshots, and documented operating limits.

## Why I Keep It Small

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how span volume and signal loss should influence a review result.

## Granite Trace Profile Yard Review Notes

The first comparison I would make is `signal loss` against `incident shape` because it shows where the rule is most opinionated.

## Included Behavior

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/granite-trace-profile-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `signal loss` and `incident shape`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Internal Model

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Scala code keeps the review rule close to the tests.

## Try It Locally

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Validation

The check exercises the source code and the review fixture. `edge` is the high score at 222; `recovery` is the low score at 129.

## Scope

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
